public class CopyArray {
    public static void main(String[] args) {
        int sum = 0;
        int multiply = 1;

        int[] arr = {5, 9, 6, 1, 8};
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < (arr.length); i++) {
            arr2[i] = arr[i];
            System.out.println(arr2[i]);
            sum += arr2[i];
            multiply *= arr2[i];
        }
        System.out.println("Sum of numbers in the array is: " + sum);
        System.out.println("Multipy of numbers in the array is: " + multiply);
    }
}
