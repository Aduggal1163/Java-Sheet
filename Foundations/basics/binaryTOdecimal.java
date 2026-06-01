public class binaryTOdecimal {
    public static int BTOD(int binaryNum)
    {
        int pow=0;
        int deciNum=0;
        while(binaryNum!=0)
        {
            int ld=binaryNum%10;
            deciNum=deciNum+(ld*(int)Math.pow(2,pow));
            pow++;
            binaryNum/=10;
        }
        return deciNum;
    }
    public static void DTOB(int deciNum)
    {
        int myNum=deciNum;
        int pow=0;
        int bNum=0;
        while(deciNum!=0)
        {
            int rem=deciNum%2;
            bNum=bNum+(rem*(int)Math.pow(10,pow));
            pow++;
            deciNum/=2;
        }
        System.out.println("BINARY NO OF "+ myNum +" is: "+bNum);
    }
    public static void main(String[] args) {
        int n=101;
        System.out.println(BTOD(n));
        DTOB(5);
    }
}
