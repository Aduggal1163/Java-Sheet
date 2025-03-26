class Solution {
    // The lower bound of a number is defined as the smallest index in the sorted
    // array where the element is greater than or equal to the given number.
    // Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 9
    // Output: 3
    // Explanation: 3 is the smallest index in arr[] where element (arr[3] = 10) is
    // greater than or equal to 9.
    int lowerBound(int[] arr, int target) {
        int n = arr.length;
        int lo = 0;
        int hi = n - 1;
        int ans = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                hi = mid - 1;
            } else
                lo = mid + 1;
        }
        return ans;
    }

    // The upper bound of a number is defined as the smallest index in the sorted
    // array where the element is greater than the given number.
    // Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 9
    // Output: 3
    // Explanation: 3 is the smallest index in arr[], at which element (arr[3] = 10)
    // is larger than 9.
    // Input: arr[] = [2, 3, 7, 10, 11, 11, 25], target = 11
    // Output: 6
    // Explanation: 6 is the smallest index in arr[], at which element (arr[6] = 25)
    // is larger than 11.
    int upperBound(int[] arr, int target) {
        int n = arr.length;
        int ans = n;
        int lo = 0;
        int hi = n - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > target) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
}
