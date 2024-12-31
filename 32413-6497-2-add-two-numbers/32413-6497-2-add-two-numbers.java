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
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carrier = 0;
        ListNode sum = new ListNode(0);
        ListNode returnedSum = sum;

        while (l1 != null || l2 != null || carrier != 0){
            int nodeSum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carrier;
            carrier = nodeSum/10;
            sum.next = new ListNode(nodeSum % 10);
            sum = sum.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return returnedSum.next;
    }
}