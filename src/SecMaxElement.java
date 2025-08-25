public class SecMaxElement {
    public static int SecMax(int[] arr, int size){
        if(size<=1){
            System.out.println("there's no sec max in the array");
            return Integer.MIN_VALUE;
        }

        int max = Math.max(arr[0], arr[1]);
        int secMax = Math.min(arr[0], arr[1]);

        for (int i = 2; i < size; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] < max) {
                secMax = arr[i];
            }
        }

        if (max == secMax) {
            System.out.println("there's no sec max in the array");
            return Integer.MIN_VALUE;
        }

        return secMax;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 2, 3, 5, 6, 8};
        System.out.println("Second max: " + SecMax(arr1, arr1.length)); // 7

        int[] arr2 = {8, 6, 5, 4};
        System.out.println("Second max: " + SecMax(arr2, arr2.length)); // 6

        int[] arr3 = {8, 8, 8};
        System.out.println("Second max: " + SecMax(arr3, arr3.length)); // no sec max

        int[] arr4 = {42};
        System.out.println("Second max: " + SecMax(arr4, arr4.length)); // no sec max
    }
}
