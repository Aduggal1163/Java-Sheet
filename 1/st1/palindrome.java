package st1;

public class palindrome {
    public static void isPalindrome(String str)
    {
        int i=0;
        int j=str.length()-1;
        char [] arr= str.toCharArray();
        while(i<j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        if(new String(arr).equals(str))
        {
            System.out.println("is a palindrome");
        }
        else
        {
            System.out.println("is not a palindrome");
        }
    }
    public static void main(String[] args) {
        String str = "madams";
        isPalindrome(str);
    }
}
