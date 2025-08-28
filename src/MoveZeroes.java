import java.util.ArrayList;
import java.util.List;

class Solution283 {
    public void moveZeroes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int n : nums) {
            if(n != 0) {
                list.add(n);
            }
        }

        for(int i=0;i<nums.length;i++) {
            if(i >= list.size()) {
                nums[i] = 0;

            } else {
                nums[i] = list.get(i);
            }
        }
    }
}

public class MoveZeroes {
    public static void main(String[] args) {
        Solution283 obj = new Solution283();
        int[] nums = {0};
        obj.moveZeroes(nums);
        for(int n : nums) {
            System.out.println(n);
        }
    }
}
