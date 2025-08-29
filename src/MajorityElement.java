import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> majMap = new HashMap<>();

        for (int num: nums){
            majMap.put(num, majMap.getOrDefault(num, 0) + 1);
        }

        int n = nums.length;
        for (int key : majMap.keySet()) {
            if (majMap.get(key) > n / 2) {
                return key;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        int majElement = majorityElement(nums);
        System.out.println(majElement);
    }
}
