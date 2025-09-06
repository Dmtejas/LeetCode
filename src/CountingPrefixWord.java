public class CountingPrefixWord {

    public static int isPrefixWord(String sentence, String searchWord) {
        String[] str = sentence.split(" ");
        int i = 1;
        for(String s : str) {
            if(s.startsWith(searchWord)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isPrefixWord("this problem is an easy problem", "prob"));
    }
}
