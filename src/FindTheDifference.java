import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindTheDifference {
    public static char findTheDifference(String s, String t) {

        char[] ch1 = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char ch : ch1) {
            list.add(ch);
        }
        Collections.sort(list);
        StringBuilder str1 = new StringBuilder();
        for(char ch : list) {
            str1.append(ch);
        }
        System.out.println(str1);
        char[] ch2 = t.toCharArray();
        List<Character> list1 = new ArrayList<>();
        for(char ch : ch2) {
            list1.add(ch);
        }
        Collections.sort(list1);
        StringBuilder str2 = new StringBuilder();
        for(char ch : list1) {
            str2.append(ch);
        }
        System.out.println(str2);
        str1.append(" ");
        for(int i=0;i<str1.length();i++) {
            if(str1.charAt(i) != str2.charAt(i)) {
                return str2.charAt(i);
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        System.out.println(findTheDifference("", "y"));
    }
}
