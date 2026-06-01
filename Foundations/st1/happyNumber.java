package st1;
public class happyNumber {
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
    public static void happy(int n) {
        int originalNumber = n;
        while (n != 1 && n!=4) { // Loop until n becomes 1 (happy) or 4 (not happy)
            n = sumOfSquares(n);
        }
        if (n == 1) {
            System.out.println(originalNumber + " is a happy number: true");
        } else {
            System.out.println(originalNumber + " is not a happy number: false");
        }
    }
    public static void main(String[] args) {
        int n = 19;
        happy(n);  // Output: 19 is a happy number: true
    }
}
