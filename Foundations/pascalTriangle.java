import java.util.*;
public class pascalTriangle {
    // Method to print Pascal's Triangle
    public static void printPascalTriangle(int n) {
     for(int line=0;line<n;line++)
     {
        int value=1;
        for(int i=0;i<n-line;i++)
        {
            System.out.print(" ");
        }
        for(int j=0;j<=line;j++)
        {
            System.out.print(value+" ");
            value=value*(line-j)/(j+1);
        }
        System.out.println();
        
     }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();
        printPascalTriangle(rows);
        scanner.close();
    }
}