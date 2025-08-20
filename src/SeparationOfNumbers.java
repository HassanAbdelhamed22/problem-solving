public class SeparationOfNumbers {
    static void separationOfNumbers(int n){
        if (n == 0)
            return;
        else {
            separationOfNumbers(n / 10);
            System.out.println(n % 10);
        }
    }

    public static void main(String[] args) {
        separationOfNumbers(182261);
    }
}
