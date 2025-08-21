import java.util.Scanner;

public class Mango {
    public static int mango(int quantity, int price){
        return (quantity - quantity / 3) * price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the quantity of mango");
        int quantity = scanner.nextInt();

        int price = 3;
        int total = mango(2, 3);

        System.out.println("Quantity = " + quantity);
        System.out.println("Price = " + price);
        System.out.println("Total cost ==> " + total);

        int paidMangoes = quantity - quantity / 3;
        int freeMangoes = quantity / 3;

        System.out.println(
                "Paid " + paidMangoes + " mangoes for $" + price + " per unit = $" + total +
                        (freeMangoes > 0 ? "; got " + freeMangoes + " mango(es) for free" : "; no mango for free")
        );
    }
}
