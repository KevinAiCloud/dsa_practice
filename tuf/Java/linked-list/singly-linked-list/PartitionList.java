/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
    List1 is Smaller Numbers
    List2 is Greater Numbers
 */
class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode List1=new ListNode(-1);
        ListNode List2=new ListNode(-1);
        ListNode L1=List1;
        ListNode L2=List2;
        ListNode curr=head;
        while(curr!=null)
        {
            if(curr.val<x){
                L1.next=curr;
                L1=L1.next;
            }
            else{
                L2.next=curr;
                L2=L2.next;
            }
            curr=curr.next;
        }
        L2.next=null;
        L1.next=List2.next;
        return List1.next;
    }
}