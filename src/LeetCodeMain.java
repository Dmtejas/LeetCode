import java.util.Scanner;



public class LeetCodeMain {
    ListNode head;

    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data); // create new node
        newNode.next = head;           // point newNode to current head
        head = newNode;                // update head to newNode
    }


    public static void main(String[] args) {

        /*
        //Two sum
        TwoSum obj = new TwoSum();
        int[] arr = {3, 2, 4};
        int sum = 6;
        int[] res = obj.solution(arr, sum);
        for(int n : res) {
            System.out.println(n);
        }
        */

        /*
        //Palindrome
        Palindrome obj = new Palindrome();
        int num = 121;
        System.out.println(obj.isPalindrome(num));
        */

        /*
        //Roman to Integer
        RomanToInteger obj = new RomanToInteger();
        System.out.println(obj.solution("III"));
        */

        /*
        //Palindrome LinkedList
        LeetCodeMain list = new LeetCodeMain();
        list.insertAtBeginning(1);
        list.insertAtBeginning(2);
        list.insertAtBeginning(2);
        list.insertAtBeginning(1);
        PalindromeLL obj = new PalindromeLL();
        //System.out.println(obj.isPalindrome(list.head));
        System.out.println(obj.solution(list.head));
        */

//        //Common Prefix
//        CommonPrefixString obj = new CommonPrefixString();
//        String[] strs = {"lower", "flow", "flow"};
//        System.out.println(obj.solution(strs));

//        LeetCodeMain list = new LeetCodeMain();
//        list.insertAtBeginning(-4);
//        list.insertAtBeginning(0);
//        list.insertAtBeginning(2);
//        list.insertAtBeginning(3);
////        ListNode temp = list.head;
////        ListNode ref = null;
////        while(temp.next != null) {
////            temp = temp.next;
////            if(temp.val == 2) {
////                ref = temp;
////            }
////        }
////        temp.next = ref;
//        hasCycle obj = new hasCycle();
//        System.out.println(obj.solution(list.head));

//        MajorityElement obj = new MajorityElement();
//        int[] arr = {2,2,2,2,2,2,3,3,3,1,3,3,1,3,3,1,3,3,1,3,3,3,1};
//        System.out.println(obj.solution(arr));

//        //Difference Strings
//        DifferenceStrings obj = new DifferenceStrings();
//        System.out.println(obj.solution("", "y"));

        //Valid pranthesis
        ValidParanthesis obj = new ValidParanthesis();
        System.out.println(obj.solution("("));


    }
}