import java.util.Map;
import java.util.*;

public class IntersectionLL {
    public ListNode solution(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> umap = new HashMap<>();
        ListNode temp = headA;
        while(temp != null) {
            umap.put(temp, temp.val);
            temp = temp.next;
        }
        ListNode temp1 = headB;
        while(temp1 != null) {
            if(umap.containsKey(temp1)) {
                return temp1;
            }
            temp1 = temp1.next;
        }
        return null;
    }
}
