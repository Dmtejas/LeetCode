import java.util.HashMap;
import java.util.Map;

public class SingleElementInSortedArray {

    public static int singleNonDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n : nums) {
            if(map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n , 1);
            }
        }

        for(int key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 7, 7, 10, 11, 11};
        System.out.println(singleNonDuplicate(nums));
    }
}
