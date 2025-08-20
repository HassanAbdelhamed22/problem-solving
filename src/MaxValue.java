public class MaxValue {
    public static void main(String[] args) {
        int max = 0;

        int[] arr = {5, 9, 6, 2, 12};

        for (int i = 0; i < (arr.length); i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max value in array is: " + max);
    }
}
