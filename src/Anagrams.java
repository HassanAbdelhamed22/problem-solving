import java.util.Arrays;

public class Anagrams {
    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        // Sort
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();
        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        // Compare
        return Arrays.equals(s1Arr, s2Arr);
    }

    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";

        if(areAnagrams(s1, s2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
