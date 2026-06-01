public class quiz {
    public static void pip(int n)
    {
        if(n==0) return;
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
    }
 public static void main(String[] args) {
    pip(3);
 }   
}
// it means it will print 2 pip1 2 pip1 2 and pip1 wil give 1 1 1 
