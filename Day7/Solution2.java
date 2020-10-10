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
        if(head==null)
            return null;
        if(head.next==null || k==0)
            return head;
        ListNode temp=head;
        int size=0;
        while(temp.next!=null)
        {
           temp=temp.next;
            size++;
        }
        size++;
        
        k=k%size;
        k=size-k;
       
        ListNode tail=temp;
       //  System.out.println(tail.val);
        temp=head;
        while(k!=1)
        {
            temp=temp.next;
            k--;
        }
        
        tail.next=head;
        head=temp.next;
        temp.next=null;
        return head;
        
    }
}
