public class Sum {
    public static int sum(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        return n + sum(n-1);
    }

    // sum from number to another number
    static int sumTwo(int n1, int n2){
        if (n1 > n2) {
            return 0;
        }
        return n1 + sumTwo(n1 + 1, n2);
    }
    public static void main(String[] args) {
        System.out.println(sum(5)); // 5+4+3+2+1 = 15
        System.out.println(sumTwo(3, 5)); // 3+4+5 = 12
    }
}
