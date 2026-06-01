public class percentage {
    public static void main(String[] args) {
        //percentage of uppercase lowercase numbers and characters
        String str = " Abc12345!@";
        int total=str.length()-1;
        int upperCase = 0, lowerCase = 0, numbers = 0, special=0;
        for (int i = 0; i < str.length(); i++) {
                char ch=str.charAt(i);
                if(Character.isUpperCase(ch))
                {
                    upperCase++;
                }
                else if(Character.isLowerCase(ch))
                {
                    lowerCase++;
                }
                else if(Character.isDigit(ch))
                {
                    numbers++;
                }
                else
                {
                    special++;
                }
        }
        int upperPer=(upperCase*100)/total;
        int lowerPer=(lowerCase*100)/total;
        int numberPer=(numbers*100)/total;
        int specialPer=100-(upperPer+lowerPer+numberPer);
        System.out.println(upperPer+"%");
        System.out.println(lowerPer+"%");
        System.out.println(numberPer+"%");
        System.out.println(specialPer+"%");
        // System.out.println(total);
    }
}
