import java.util.*;

class Solution125 {
    public boolean isPalindrome(String s) {
        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.add('f');
        list.add('g');
        list.add('h');
        list.add('i');
        list.add('j');
        list.add('k');
        list.add('l');
        list.add('m');
        list.add('n');
        list.add('o');
        list.add('p');
        list.add('q');
        list.add('r');
        list.add('s');
        list.add('t');
        list.add('u');
        list.add('v');
        list.add('x');
        list.add('y');
        list.add('z');
        list.add('0');
        list.add('1');
        list.add('2');
        list.add('3');
        list.add('4');
        list.add('5');
        list.add('6');
        list.add('7');
        list.add('8');
        list.add('9');
        s = s.toLowerCase();
        s = s.trim();
        StringBuilder res = new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if(list.contains(s.charAt(i))) {
                res = res.append(s.charAt(i));
            }
        }
        int first = 0;
        int last = res.length()-1;
        while(first <= last) {
            if(res.charAt(first) != res.charAt(last)) {
                return false;
            }
            first++;
            last--;

        }
        return true;
    }
}

public class ValidPalindrome {
    public static void main(String[] args) {
        Solution125 obj = new Solution125();
        System.out.println(obj.isPalindrome(" "));
    }
}
