import java.util.*;

public class UniqueCharacter {
    public static int firstUniqueChar(String s) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
//        Set<Character> set = new HashSet<>();
//        set = map.keySet();
//        List<Character> list = new ArrayList<>();
        System.out.println(map);
        for(char key : map.keySet()) {
            if(map.get(key) == 1) {
                return s.indexOf(key);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueChar("loveleetcode"));
    }
}
