import java.util.*;

public class Palindrome {

    /*
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int original = x;
        int res = 0;
        while(x != 0) {
            int rem = x % 10;
            res = res * 10 + rem;
            x /= 10;
        }
        System.out.println(res);
        return res == original;

    }*/
    private boolean checkPalindrome(String num) {
        int left = 0;
        int right = num.length()-1;
        while(left < right) {
            if(num.charAt(left) != num.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        String num = x + "";
        return checkPalindrome(num);
    }
}

