import java.util.*;

public class K_DiffPairs {

    public static int findPairs(int[] nums, int k) {
        int left = 0;
        int right = nums.length -1;
        Arrays.sort(nums);
        int count = 0;
        //List<int[]> pairList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        while(left < right) {
            if(Math.abs(nums[left] - nums[right]) < k) {
                left++;
                right = nums.length-1;
            } else if(Math.abs(nums[left] - nums[right]) == k ) {
//                System.out.println("Difference :: " + Math.abs(nums[left] - nums[right]));
//                boolean flag = false;
//                for(int[] pair : pairList) {
//                    if(pair[0] == nums[left] && pair[1] == nums[right]) {
//                        flag = true;
//                        break;
//                    }
//                }
//                if(!flag) {
//                    int[] pair = {nums[left], nums[right]};
//                    pairList.add(pair);
//                    for(int[] arr : pairList) {
//                        System.out.println(arr[0] + " " + arr[1]);
//                    }
//                    count++;
//                }
//                right--;
//                if(right <= left) {
//                    left++;
//                    right = nums.length-1;
//                }
                if(!map.containsKey(nums[left])) {
                    map.put(nums[left], nums[right]);
                    count++;
                }
                right--;
                if(right <= left) {
                    left++;
                    right = nums.length-1;
                }

            }
            else {
                right--;
                if(left >= right) {
                    left++;
                    right = nums.length-1;
                }


            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        System.out.println(findPairs(nums, 1));
    }
}
