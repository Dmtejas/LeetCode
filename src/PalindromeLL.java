
public class PalindromeLL {
    public boolean solution(ListNode head) {
        if(head == null) {
            return false;
        }
        if(head.next == null) {
            return true;
        }
        String x = "";
        ListNode temp = head;
        while(temp != null) {
            x = x + (temp.val + "");
            temp = temp.next;
        }
        int left = 0;
        int right = x.length()-1;
        while(left < right) {
            if(x.charAt(left) != x.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null) {
            return false;
        }
        if(head.next == null) {
            return true;
        }
        int value;
        ListNode tail = null;
        ListNode temp = head;
        while (temp != null) {
            value = temp.val;
            ListNode reverseNode = new ListNode(value);
            reverseNode.next = tail;
            tail = reverseNode;
            temp = temp.next;
        }

        ListNode t1 = head;
        ListNode t = tail;
        ListNode t2 = tail;
        while(t1 != null && t2 != null) {
            if(t1.val != t2.val) {
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
}