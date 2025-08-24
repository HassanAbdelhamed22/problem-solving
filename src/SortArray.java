public class SortArray {
    public static void bubbleSort(int[] arr){
        int temp;
        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
           if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {22, 94, 15, 1, 96, 48};
        int[] arr2 = {1, 2, 3, 4, 5};

        bubbleSort(arr2);

        for (int j : arr2) {
            System.out.println(j);
        }

    }
}
