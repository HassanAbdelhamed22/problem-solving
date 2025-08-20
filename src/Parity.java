import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        int n = 0, num1 = 0, num2 = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("enter the number to check");
            n = scanner.nextInt();
            if (n % 2 == 0){
                num1++;
            } else {
                num2++;
            }
        }

        System.out.println("the even number = " + num1);
        System.out.println("the odd number = " + num2);
    }
}
