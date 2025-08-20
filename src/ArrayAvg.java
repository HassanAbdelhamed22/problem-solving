public class ArrayAvg {
    public static void main(String[] args) {
        int sum = 0;

        int[] arr = {5, 9, 6, 2, 8};

        for (int i = 0; i < (arr.length); i++) {
            sum += arr[i];
        }
        System.out.println("The avg of array is: " + (double) sum / arr.length);
    }
}
