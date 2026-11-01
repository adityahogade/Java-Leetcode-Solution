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
    public ListNode deleteDuplicates(ListNode head) {
    if(head==null || head.next==null) return head;
    ListNode prev=head;
    ListNode n=head.next;
    while(n!=null){
        while(n!= null && n.val==prev.val){
            n=n.next;
        }
        prev.next=n;
        prev=prev.next;
        if(n!=null)  n=n.next;
    }
    return head;

    }
}