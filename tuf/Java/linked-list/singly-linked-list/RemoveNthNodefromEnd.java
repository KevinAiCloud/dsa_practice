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
class RemoveNthNodefromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head, fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast!=null){
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
        }
        else{
            return head.next;
        }
    }
}