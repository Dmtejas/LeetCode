class Solution1 {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        for(i=0;i<nums.length;i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return i;
    }
}


public class SearchPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        Solution1 obj = new Solution1();
        System.out.println(obj.searchInsert(nums, target));
    }
}
