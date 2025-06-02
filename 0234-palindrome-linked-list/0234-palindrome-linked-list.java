/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode reverse = reverseListNode(slow);

        ListNode p1 = head;
        ListNode p2 = reverse;
        while(p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    public static ListNode reverseListNode(ListNode head){
        if(head == null) return null;

        ListNode prev = null;
        while(head != null){
            ListNode newNode = head.next;
            head.next = prev;
            prev = head;
            head = newNode;
        }

        return prev;
    }
}