/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)   //null or single node with no cycle
            return null;
        
        ListNode fast = head, slow = head;      // 2ptrs
        while(fast != null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;
            
            if( slow == fast)
                break;
        }
        if(slow != fast)    //no cycle
            return null;
        
       slow = head;     // if they meet reset one of them and move with equal speed
       while(slow != fast)
       {
           slow = slow.next;
           fast = fast.next;
       }
           
        
        return slow;    
    }
}