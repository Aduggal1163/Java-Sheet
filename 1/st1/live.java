package st1;
import java.util.Scanner;
public class live{
    public static int live(int i,int j,int[][] mat){
        int c=0;
        if(i-1>=0 && mat[i-1][j]==1) c++;     //top
        if(i+1< mat.length && mat[i+1][j]==1 ) c++;   //bottom
        if(j-1>=0 && mat[i][j-1]==1) c++; //left
        if(j+1<mat[0].length && mat[i][j+1]==1) c++; //right
        return c;
    }
   public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int n = sc.nextInt();
       int m = sc.nextInt();
       int[][] mat = new int[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               mat[i][j] = sc.nextInt();
           }
       }
       int[][] res = new int [n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               int live = live(i,j,mat);
               if(mat[i][j]==1 && live<2){
                   res[i][j]=0;
               }
               else if(mat[i][j]==1 && (live==2 || live==3)){
                   res[i][j]=1;
               }
               else if(mat[i][j]==1 && live>3){
                   res[i][j]=0;
               }
               else if(mat[i][j]==0 && live==3){
                   res[i][j]=1;
               }
           }
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               System.out.print(res[i][j] + " ");
           }
           System.out.println();
       }
   }

}
