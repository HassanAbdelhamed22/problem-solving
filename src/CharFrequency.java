import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "HellO World";

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

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
