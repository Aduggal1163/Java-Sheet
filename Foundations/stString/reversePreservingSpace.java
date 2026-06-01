public class reversePreservingSpace {
    public static String rev(String input){
        char [] chars=input.toCharArray();
        int left=0,right=chars.length-1;
        while(left<right){
            if(chars[left]==' '){
                left++;
                }
                else if(chars[right]==' '){
                    right--;
                    }
                    else{
                        char temp=chars[left];
                        chars[left]=chars[right];
                        chars[right]=temp;
                        left++;
                        right--;
                        }
                    }
                        return new String(chars);
    }
    public static void main(String[] args) {
        String input = "welcome to java class";
        String ans=rev(input);
        System.out.println(ans);
    }
}

