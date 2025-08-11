import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MajorityElement {
    public int solution(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Map<Integer, Integer> umap = new HashMap<>();
        for(int num : nums) {
            if(umap.containsKey(num)) {
                umap.put(num, umap.get(num)+1);
            } else {
                umap.put(num, 1);
            }
        }
        Set<Integer> uset = umap.keySet();
        int max = 0;
        for(int set : uset) {
            if(max < umap.get(set)) {
                max = umap.get(set);
            }
        }
        for(int set : uset) {
            if(umap.get(set) == max) {
                return set;
            }
        }
        return -1;
    }
}
