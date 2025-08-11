public class CommonPrefixString {
    public String solution(String[] strs) {
            int min = strs[0].length();
            for(int i=1;i<strs.length;i++) {
                if(min > strs[i].length()) {
                    min = strs[i].length();
                }
            }
            for(int i=1;i<=min;i++) {
                int flag = 0;
                for(int j=1;j<strs.length;j++) {
                    if(strs[0].substring(0, i).equals(strs[j].substring(0, i))) {
                        flag++;
                    }
                }
                if(flag != strs.length - 1) {
                    return strs[0].substring(0, i-1);
                }
            }
            return strs[0].substring(0, min);

    }
}