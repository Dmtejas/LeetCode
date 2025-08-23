class Solution66 {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        if (digits[length - 1] != 9) {
            digits[length - 1] += 1;
            return digits;
        }
        int flag = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                flag++;
            } else {
                break;
            }
        }
        if (flag == length) {
            int[] res = new int[length + 1];
            res[0] = 1;
            for (int j = 1; j < res.length; j++) {
                res[j] = 0;
            }
            return res;
        }
        int pos = length - flag - 1;
        digits[pos] += 1;
        for (int j = pos + 1; j < length; j++) {
            digits[j] = 0;
        }
        return digits;

    }
}

public class PlusOne {
    public static void main(String[] args) {
        Solution66 obj = new Solution66();
        int[] digits = { 4, 9, 9, 9 };
        int[] res = obj.plusOne(digits);
        for (int n : res) {
            System.out.println(n);
        }
    }
}