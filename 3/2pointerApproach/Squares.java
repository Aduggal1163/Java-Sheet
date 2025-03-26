class Squares { 
    public static void main(String[] args) {
        int arr[] = {-4, -1, 0, 3, 10};
        int n = arr.length;
        int ans[] = new int[n];
        
        int i = 0, j = n - 1, k = n - 1;
        
        while (i <= j) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                ans[k--] = arr[i] * arr[i];
                i++;
            } else {
                ans[k--] = arr[j] * arr[j];
                j--;
            }
        }
        
        // Printing the result
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}
