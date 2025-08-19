import java.util.Scanner;

public class Factorial {
    public static long factorial(int n) {
        if (n == 0 || n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        long x = factorial(num);

        if (x % 2 == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
