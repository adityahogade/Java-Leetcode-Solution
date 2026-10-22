/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        
        Node ans=new Node(head.val);
        if(head.next==null) {
            if(head.random!=null){
                ans.random= ans;
            }
            return ans;
        }
        Node curr=head.next;
        Node ansCurr=ans;
        HashMap<Node,Integer> hm1=new HashMap<>();
        HashMap<Integer,Node> hm2=new HashMap<>();


        int i=0;
          hm2.put(i,ansCurr);
          hm1.put(head,i++);
      
        
        while(curr!=null){
           
            Node n1=new Node(curr.val);
            ansCurr.next=n1;
            ansCurr=ansCurr.next;
            hm1.put(curr,i);
            hm2.put(i,ansCurr);
            i++;
            curr=curr.next;
        }       
        ansCurr=ans;
        curr=head;
        while(ansCurr!=null){
        
            if(curr.random!= null){
                System.out.println(hm1.get(curr.random));
                  ansCurr.random=hm2.get(hm1.get(curr.random));
            }
            curr=curr.next;
            ansCurr=ansCurr.next;

        }
        return ans;
    }
}