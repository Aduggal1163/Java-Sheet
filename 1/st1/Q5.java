package st1;

public class Q5 {
    public static void bitwiseResults(int n, int k) {
        int maxAnd = 0;
        int maxOr = 0;
        int maxXor = 0;

        // Iterate through all pairs (i, j) where 1 <= i < j <= n
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int andResult = i & j;
                int orResult = i | j;
                int xorResult = i ^ j;

                // Update maxAnd if andResult is less than k and is greater than current maxAnd
                if (andResult < k) {
                    maxAnd = Math.max(maxAnd, andResult);
                }
                // Update maxOr if orResult is less than k and is greater than current maxOr
                if (orResult < k) {
                    maxOr = Math.max(maxOr, orResult);
                }
                // Update maxXor if xorResult is less than k and is greater than current maxXor
                if (xorResult < k) {
                    maxXor = Math.max(maxXor, xorResult);
                }
            }
        }

        // Print the results
        System.out.println(maxAnd);
        System.out.println(maxOr);
        System.out.println(maxXor);
    }
    public static void main(String[] args) {
        // Example input
        int n = 3;
        int k = 3;
        
        // Call the function with example input
        bitwiseResults(n, k);
    }
}
