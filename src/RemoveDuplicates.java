import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr = {1,1,5,9,8,5,4}; // [1, 1, 4, 5, 5, 8, 9]

        Set<Integer> s = new HashSet<>();

        for (int num : arr){
            s.add(num);
        }

        System.out.println("After removing element " + s);
    }
}
