/*
Reverse a singly linked list.
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode bef = head;
        ListNode cur = head.next;
        bef.next = null;
        while(cur != null){
            ListNode tmp = cur.next;
            cur.next = bef;
            bef = cur;
            cur = tmp;
        }
        return bef;
    }
}