public class RemoveChars {
    public static String remove(String str) {
        if (str == null || str.length() <= 2) {
            return "";
        }

        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        String originalString = "eloquent";
        String modifiedString = remove(originalString);
        System.out.println("Original String: " + originalString); // Output: Original String: HelloWorld
        System.out.println("Modified String: " + modifiedString); // Output: Modified String: elloWorl

        String shortString = "xyz";
        String modifiedShortString = remove(shortString);
        System.out.println("Original Short String: " + shortString); // Output: Original Short String: A
        System.out.println("Modified Short String: " + modifiedShortString); // Output: Modified Short String:
    }
}
