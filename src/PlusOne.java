class Solution3 {
    public int[] plusOne(int[] digits) {
        int l = digits.length;
        if(l == 1 && digits[l-1] == 9) {
            return new int[]{1, 0};
        }
        if(digits[l-1] == 9) {
            digits[l-1] = 0;
            digits[l-2] += 1;
        } else if(digits[l-1] == 9 && digits[l-2] == 9) {

        } else {
            digits[l-1] += 1;
        }
        return digits;
    }
}


public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1, 9};
        Solution3 obj = new Solution3();
        int[] result = obj.plusOne(digits);
        for(int n: result) {
            System.out.println(n);
        }
    }
}
