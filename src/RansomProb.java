import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RansomProb {
    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] ch1 = ransomNote.toCharArray();
        List<Character> list = new ArrayList<>();
        for(char n : ch1) {
            list.add(n);
        }
        Collections.sort(list);

        char[] ch2 = magazine.toCharArray();
        List<Character> list1 = new ArrayList<>();
        for(char n : ch2) {
            list1.add(n);
        }
        Collections.sort(list1);
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(char n : list) {
            str1.append(n);
        }
        for(char n : list1) {
            str2.append(n);
        }
        String s1 = str1.toString();
        String s2 = str2.toString();
        System.out.println(s1);
        System.out.println(s2);
        return s2.contains(s1);
    }

    public static void main(String[] args) {
        System.out.println(canConstruct("bg", "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj"));
    }
}
