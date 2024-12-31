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

        while(l1 != null || l2 != null){
            if(l2 == null){
                l2 = new ListNode(0);
            }
            if (l1 == null){
                l1 = new ListNode(0);
            }

            int nodeSum = l1.val + l2.val;
            if(nodeSum > 9) carrier = nodeSum / 10; else carrier = 0;

            sum.val = (l1.val + l2.val) % 10;
            if(l1.next != null){
                l1.next.val = l1.next.val + carrier;
                sum.next = new ListNode(0);
                sum = sum.next;
            } else if(l2.next != null){
                l2.next.val = l2.next.val + carrier;
                sum.next = new ListNode(0);
                sum = sum.next;
            }


            l1 = l1.next;
            l2 = l2.next;
        }
        if (carrier != 0) {
            sum.next = new ListNode(carrier);
        }
        return returnedSum;
    }
}