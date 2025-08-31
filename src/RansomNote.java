import java.util.HashMap;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> counts = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            counts.put(ch, counts.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if (!counts.containsKey(ch) || counts.get(ch) == 0) {
                return false;
            }
            counts.put(ch, counts.get(ch) - 1);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("a", "b"));     // false
        System.out.println(canConstruct("aa", "ab"));   // false
        System.out.println(canConstruct("aa", "aab"));  // true
    }
}
