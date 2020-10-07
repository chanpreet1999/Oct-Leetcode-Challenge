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
    public ListNode rotateRight(ListNode head, int k) {
        if( head == null || head.next == null || k == 0 )
            return head;
        
        ListNode tail = null;
        int n = 0;
        
        for( tail = head; tail.next != null; tail = tail.next )
        {
            n++;
        }
        
        n++;
        k = k % n;
        if(k == 0)
            return head;
        
        ListNode cur = head;
        for(int i = 1; i < n-k; i++)
        {
            cur = cur.next;
        }
        ListNode nHead = cur.next;
        cur.next = null;
        tail.next = head;
        
        return nHead;
    }
}