public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Print original array
        System.out.print("Original array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        // Print reversed array
        System.out.print("\nReversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
