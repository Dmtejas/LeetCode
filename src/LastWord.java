class Solution2 {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        int count = 0;
        if(l == 1) {
            return 0;
        }
        for(int i=l-1;i>=0;i--) {
            if(s.charAt(i) != 32) {
                count++;
            } else if(s.charAt(i) == 32 && count > 1) {
                return count;
            }
        }
        return -1;
    }
}


public class LastWord {
    public static void main(String[] args) {
        String s = "luffy is still joyboy";
        Solution2 obj = new Solution2();
        System.out.println(obj.lengthOfLastWord(s));
    }
}
