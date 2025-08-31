import java.util.HashSet;

public class ContainsDuplicateII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            // if element already in the window → duplicate within k
            if (window.contains(nums[i])) {
                return true;
            }

            // add current number into window
            window.add(nums[i]);

            // keep window size <= k
            if (window.size() > k) {
                window.remove(nums[i - k]); // remove the oldest element
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1}, 3)); // true
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1)); // true
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3}, 2)); // false
    }
}
