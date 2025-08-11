public class LLInertion {
    ListNode head = null;

    public void beginInsert(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void display() {
        ListNode temp = head;
        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        LLInertion list = new LLInertion();
        list.beginInsert(20);
        list.beginInsert(30);
        list.beginInsert(40);
        list.beginInsert(60);
        list.beginInsert(80);
        list.display();
    }
}
