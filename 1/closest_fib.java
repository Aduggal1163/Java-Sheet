import java.util.Scanner;
public class closest_fib {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
    
            int prev = 0, curr = 1, next = 1;
    
            // Finding the closest Fibonacci number greater than or equal to n
            while (next < n) {
                prev = curr;
                curr = next;
                next = prev + curr;
            }
    
            System.out.println("The next closest Fibonacci number is: " + next);
}
}