import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        int originalNum = num;
        int result = 0;

        // Count digits
        int digits = String.valueOf(num).length();

        while (num > 0){
            int lastDigit = num % 10;
            result += (int) Math.pow(lastDigit, digits);
            num /= 10;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number.");
        }
    }
}
