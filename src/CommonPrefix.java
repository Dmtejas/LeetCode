import java.util.ArrayList;

class Solution {
    public String LongestCommonPrefix(String[] strs) {
        int length = strs.length;
        String temp;
        for(int i=0;i<length;i++) {
            temp = strs[i];
            int l = temp.length();
            for(int j=0;j<l;j++) {
                
            }
        }
        return " ";
    }
}

public class CommonPrefix {
    public static void main(String[] args) {
        String[] input = {"abc", "Hjdb"};
        Solution obj = new Solution();
        System.out.println(obj.LongestCommonPrefix(input));
    }
}