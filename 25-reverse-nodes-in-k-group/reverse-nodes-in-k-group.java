class Solution {
public ListNode reverseLinkenList(ListNode head) {
ListNode prev = null;
ListNode curr = head;
    while (curr != null) {
        ListNode next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    return prev;
}

public ListNode getKthNode(ListNode temp, int k) {
    k -= 1;

    while (temp != null && k > 0) {
        k--;
        temp = temp.next;
    }

    return temp;
}

public ListNode reverseKGroup(ListNode head, int k) {
    if (head == null || k <= 1) {
        return head;
    }

    ListNode temp = head;
    ListNode prevLast = null;

    while (temp != null) {
        ListNode kThNode = getKthNode(temp, k);

        if (kThNode == null) {
            if (prevLast != null) {
                prevLast.next = temp;
            }
            break;
        }

        ListNode nextNode = kThNode.next;

        // Current group ko alag karo
        kThNode.next = null;

        // Current group reverse karo
        reverseLinkenList(temp);

        // Previous group ko current group se connect karo
        if (prevLast == null) {
            head = kThNode;
        } else {
            prevLast.next = kThNode;
        }

        // Reversed group ka last node
        prevLast = temp;

        // Next group par move karo
        temp = nextNode;
    }

    return head;

}
}
