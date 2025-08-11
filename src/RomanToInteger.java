import java.util.*;

public class RomanToInteger {
    public int solution(String s) {
        Map<Character, Integer> umap = new HashMap<Character, Integer>();
        umap.put('I',1);
        umap.put('V',5);
        umap.put('X',10);
        umap.put('L',50);
        umap.put('C',100);
        umap.put('D',500);
        umap.put('M',1000);
        int result = 0;
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            int j=i+1;
            if(j >= s.length()) {
                result += umap.get(ch);
                break;
            }
            char next = s.charAt(j);
            if(umap.get(ch) >= umap.get(next)) {
                result += umap.get(ch);
            } else {
                result = result - umap.get(ch);
            }
        }
        return result;
    }
}