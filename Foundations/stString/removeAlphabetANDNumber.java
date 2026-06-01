public class removeAlphabetANDNumber {
    // removeAlphabetANDNumber.java
    public static void main(String[] args) {
        String str="A!b@D456TY";
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!(ch>='a'&&ch<='z')&&!(ch>='A'&&ch<='Z')&&!(ch>='0'&&ch<='9')){
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
