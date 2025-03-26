package st1;
import java.util.Arrays;
public class Q9 {
    public static void reverseArray(char[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int n = 556;
        String str = Integer.toString(n);
        char[] arr = str.toCharArray(); 

        Arrays.sort(arr); 
        String smallest = new String(arr);
        reverseArray(arr);
        String largest = new String(arr);
        int smallestInt=Integer.parseInt(smallest);
        int largestInt=Integer.parseInt(largest);
        System.out.println(smallestInt+largestInt);
    }

    
}