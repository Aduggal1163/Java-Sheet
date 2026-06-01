public class CW {
    public static String compress(String str){
        String newStr="";
        int n=str.length();
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1&& str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newStr+=str.charAt(i);
            newStr+=count.toString();
        }
        return newStr;
    }
    public static void main(String args[])
    {
        String str="aabbccdeo";
        System.out.println(compress(str));
         // int n=50113;
        // int sum=0;
        // while(n!=0)
        // {
        //     int ld=n%10;
        //     sum+=ld;
        //     n/=10;
        // }
        // int sumO=0;
        // if(sum>=10)
        // {
        //     while(sum!=0)
        //     {
        //         int ld=sum%10;
        //         sumO+=ld;
        //         sum/=10;
        //     } 
        // }
        // if(sumO==1) System.out.println("TRUE");
        // else{
        //     System.out.println("False");
        // }
    }
}
