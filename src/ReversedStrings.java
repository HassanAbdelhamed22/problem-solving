public class ReversedStrings {
    public static String solution(String str) {
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }

    // another solution with built-in reverse
    public static String solution2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static void main(String[] args) {
        String reversed = solution("world");
        String reversed2 = solution2("world");
        System.out.println(reversed);
        System.out.println(reversed2);
    }
}
