import java.util.*;

public class TwoSum {
    public int[] solution(int[] a, int s) {
        int l = a.length;
        HashMap<Integer, Integer> umap = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for(int i=0;i<l;i++) {
            if(!umap.containsKey(s-a[i])) {
                umap.put(a[i], i);
            } else {
                res[0] = s-a[i];
                res[1] = a[i];
                return res;
            }
        }
        return res;
    }
}