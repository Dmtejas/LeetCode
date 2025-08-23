import java.util.*;

class solution {
    ListNode deleteDuplicates(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode temp = head;
        ListNode resHead = null;
        while(temp != null) {
            if(!list.contains(temp.val)) {
                ListNode newNode = new ListNode(temp.val);
                if(resHead == null) {
                    newNode = resHead;
                } else {
                    ListNode node = resHead;
                    while(node.next != null) {
                        node = node.next;
                    }
                    node.next = newNode;
                }
                newNode.next = null;
                list.add(temp.val);
            }
        }
        return resHead;
    }
}


public class RemoveDuplicatesList {
    public static void main(String[] args) {

    }
}
