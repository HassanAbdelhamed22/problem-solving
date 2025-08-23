public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String result = "";
        result += Character.toUpperCase(name.charAt(0));

        result += ".";

        int spaceIndex = name.indexOf(" ");
        result += Character.toUpperCase(name.charAt(spaceIndex + 1));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("patrick feeney"));
    }
}
