import java.util.*;
public class patern {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0||j==0||i==n-1||j==n-1){
                    System.out.print("3");
                }
                else if(i==n/2&& j==n/2) 
                {
                    System.out.print("1");
                }
                else 
                System.out.print("2");
            }
            System.out.print("\n");
        }
        
    }
}
