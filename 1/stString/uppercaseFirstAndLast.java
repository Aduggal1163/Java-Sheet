public class uppercaseFirstAndLast {
    // 20. WAP program to change the first and last character of each word to uppercase.
    // Input: welcome to chitkara UNIVERSITY
    // Output: WelcomE TO ChitkarA UniversitY
    public static void main(String[] args) {
        String str = "welcome to chitkara UNIVERSITY";
        char[] ch = str.toCharArray();

        // Flag to determine the start of a word
        boolean startOfWord = true;

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                startOfWord = true;
            } else {
                if (startOfWord) {
                    // Capitalize the first character of the word
                    ch[i] = Character.toUpperCase(ch[i]);
                    startOfWord = false;
                }
                if (i == ch.length - 1 || ch[i + 1] == ' ') {
                    // Capitalize the last character of the word
                    ch[i] = Character.toUpperCase(ch[i]);
                }
            }
        }

        // Convert the char array back to a string
        String ans = new String(ch);
        System.out.println(ans);
    }
}
