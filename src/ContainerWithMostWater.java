public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0, currentArea = 0;

        while(left < right) {
            currentArea = (Integer.min(height[left], height[right]) * (right - left));
            System.out.println(currentArea);
            if(maxArea < currentArea) {
                maxArea = currentArea;
            }
            if(height[left] < height[right]) {
                left++;
            } else if(height[left] >= height[right]) {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }
}
