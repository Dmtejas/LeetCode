import java.util.*;

public class DifferenceStrings {
    public char solution(String s, String t) {
        Map<Character, Boolean> umap = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            umap.put(s.charAt(i), true);
        }

        for(int i=0;i<t.length();i++){
            if(!umap.containsKey(t.charAt(i))) {
                return t.charAt(i);
            }
        }
        return ' ';
    }
}
