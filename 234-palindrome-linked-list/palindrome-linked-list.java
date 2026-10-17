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
           ListNode first = head;
        ListNode second = head;
        ListNode midd = null;


        while (first != null && first.next != null) {
            midd = second;
            second = second.next;
            first = first.next.next;
        }
        ListNode curr = second;
        ListNode temp = head;
        ListNode prev = null;

      while(curr != null){
        ListNode next = curr.next;

         curr.next = prev;

         prev = curr;
         curr = next;  
        }
        curr = prev;
        while(temp != null && curr != null){

          if(temp.val != curr.val){
             return false;
           }


          temp = temp.next;
          curr = curr.next;
        }
        return true;
    }
}