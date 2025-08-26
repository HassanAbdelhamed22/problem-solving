import java.util.HashMap;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "hassan";
        char c = 0;

        // Convert string to lowercase to ignore case
        str = str.toLowerCase();

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch: str.toCharArray()){
            if (ch != ' ') { // ignore spaces
                // Put character with count or increment if already exists
                freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
            }
        }

        for (char ch : str.toCharArray()) {
            if (ch != ' ' && freqMap.get(ch) == 1){
                c = ch;
                break;
            }
        }
            System.out.println(c);
    }
}
