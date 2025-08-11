import java.util.*;

public class hasCycle {
    public boolean solution(ListNode head) {
        ListNode temp = head;
        Map<ListNode, Integer> umap = new HashMap<>();
        while(temp != null) {
            if(umap.containsKey(temp)) {
                return true;
            } else {
                umap.put(temp, temp.val);
                temp = temp.next;
            }
        }
        return false;
    }
}
