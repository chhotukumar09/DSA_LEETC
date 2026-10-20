/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // ListNode tempA = headA;
        // while(tempA != null){
        //  ListNode tempB = headB;
        //  while(tempB != null){
        //     if(tempA == tempB){
        //         return tempA;
        //     }
        //     tempB = tempB.next;
        //  }

        //   tempA = tempA.next;
        // }
        // return null;
        // using HashMap
        // HashMap<ListNode, Integer> map = new HashMap<>();
        // ListNode tempA = headA;
        // while(tempA != null){
        //     map.put(tempA,1);
        //     tempA = tempA.next;
        // }
        // ListNode tempB = headB;
        
        // while(tempB != null){
        //     if(map.containsKey(tempB))return tempB;
        //     tempB = tempB.next;
            
        // }
        // return null;
        if(headA == null || headB == null) return null;
        ListNode temp1 = headA, temp2 = headB;
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
            if(temp1 == temp2) return temp1;
            if(temp1 == null) temp1 = headB;
            if(temp2 == null) temp2 = headA;
        }
        return temp1;
        

    }
}