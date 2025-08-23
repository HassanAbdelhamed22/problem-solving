import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int element = sc.nextInt();
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if (element == arr[i]){
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("the number is here and it's number is: " + element);
        else
            System.out.println("the number that you are looking for not found");
    }
}
