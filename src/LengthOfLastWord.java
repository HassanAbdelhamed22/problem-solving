public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int count = 0;

        String str = s.trim();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' '){
                count = 0;
            } else {
                count ++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str = "   fly me   to   the moon  ";

        int length = lengthOfLastWord(str);
        System.out.println(length);
    }
}
