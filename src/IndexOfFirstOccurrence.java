public class IndexOfFirstOccurrence {
    public static int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m > n) return -1; // needle longer than haystack

        // check each possible starting index
        for (int i = 0; i <= n - m; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i; // found the first occurrence
            }
        }
        return -1; // not found
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));   // 0
        System.out.println(strStr("leetcode", "leeto"));  // -1
    }
}
