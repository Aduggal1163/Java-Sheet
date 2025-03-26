import java.util.Arrays;

public class incrementAnArray{
    public static int[] incrementArray(int[] digits) {
        // Start from the last digit of the array
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // Return as soon as we successfully increment
            }
            // If the digit is 9, it becomes 0 (carry over)
            digits[i] = 0;
        }
        // If we reach here, it means all digits were 9 and we have an overflow
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1; // Set the first digit to 1, the rest are initialized to 0
        return newNumber;
    }
     public static void main(String[] args) {
        int[] digits = {1, 2, 3}; // Example input

        // Increment the array
        int[] result = incrementArray(digits);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}