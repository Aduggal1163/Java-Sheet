class MinHeap{
    public int arr[];
    public  int size;
     MinHeap(int capacity)
     {
        arr=new int[capacity];
        size=0;
     }
     public void add(int num){
        arr[size]=num;
        size++;
        upheapify(size-1);//index 
     }
     public void upheapify(int idx)
     {
        if(idx==0) return;
        int parent=(idx-1)/2;
        if(arr[idx]<arr[parent])
        {
            swap(idx,parent);
            upheapify(parent);
        }
     }
     public int peek(){
        return arr[0];
     }
     public void swap(int i , int j)
     {
        int temp=i;
        i=j;
        j=temp;
     }
     public int remove()
     {
      int peek=arr[0];
      swap(0,size-1);
      size--;
      downHeapify(0);
      return peek;
     }
     public void downHeapify(int idx){
      if(idx>=size)return;
      int lc=2*idx+1;
      int rc=2*idx+2;
      int minIdx=idx;
      if(lc<=size && arr[lc]<arr[minIdx]) minIdx=lc;
      if(rc<=size && arr[rc]<arr[minIdx]) minIdx=rc;
      if(idx==minIdx)return;
      swap(idx,minIdx);
      downHeapify(minIdx);
     }
}
class MinHeapImplementationArray{
    public static void main(String[] args) {
         MinHeap pq=new MinHeap(10);
         pq.add(1);
         pq.add(6);
         pq.add(2);
         System.out.println(pq.size+" "+pq.peek());
    }
}