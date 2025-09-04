import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int n : nums) {
            if(n == 1) {
                count++;
            }
            else {
                list.add(count);
                count = 0;
            }
        }
        System.out.println(list);
        return Collections.max(list);
    }

    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
