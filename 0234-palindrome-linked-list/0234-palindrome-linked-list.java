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
        ListNode fast = head ;
        ListNode slow = head ;
        while(fast != null && fast.next != null){
            fast = fast.next.next ;
            slow = slow.next ;
        }
        ListNode prev = null ;
        ListNode curr = slow ;
        while(curr != null){
            ListNode temp = curr.next ;
            curr.next = prev ;
            prev = curr ;
            curr = temp ;   
        }
        ListNode first = head ;
        ListNode second = prev ;
        while(second != null){
            if(second.val != first.val){
                return false ;
            }
            first = first.next ;
            second = second.next ;
        }
        return true ;
    }
}