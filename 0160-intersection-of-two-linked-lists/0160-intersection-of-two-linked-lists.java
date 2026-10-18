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
 ListNode temp1=headA;
 ListNode temp2=headB;
 HashMap<ListNode,Integer> hm=new HashMap<>();
 while(temp1!=null || temp2!=null){
   
    if(temp1==temp2){
        return temp1;

    }
    

    if(hm.containsKey(temp1) ){
        return temp1;
    }
    else if(hm.containsKey(temp2) ){
        return temp2;

    }
    if(temp1!=null){
        hm.put(temp1,1);
        
    temp1=temp1.next;}
    if(temp2!=null){
        hm.put(temp2,1);
    temp2=temp2.next;
    }

 }

return null;
    }
}