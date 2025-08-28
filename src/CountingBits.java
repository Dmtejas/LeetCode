import java.util.ArrayList;
import java.util.List;

public class CountingBits {

    public static void reverseString(char[] s) {
        List<Character> list = new ArrayList<>();
        for(char c : s) {
            list.add(c);
        }
        int j=0;
        for(int i=list.size()-1;i>=0;i--) {
            s[j] = list.get(i);
            j++;
        }
    }

    public static int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0;i<=n;i++) {
            String flag = Integer.toBinaryString(i);
            int count = 0;
            for(int j=0;j<flag.length();j++) {
                if(flag.charAt(j) == '1') {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = countBits(5);
        for(int n: res) {
            System.out.println(n);
        }
    }
}
