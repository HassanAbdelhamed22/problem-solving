public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int j = 0;

        for (int i = 0; i < t.length() && j < s.length(); i++) {
            if (s.charAt(j) == t.charAt(i)){
                j++;
            }
        }
        return j == s.length();
    }

    public static void main(String[] args) {
        String s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
