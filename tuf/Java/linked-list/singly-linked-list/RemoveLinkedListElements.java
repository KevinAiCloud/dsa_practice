/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 * 
    Example 1:
    Input: head = [1,2,6,3,4,5,6], val = 6
    Output: [1,2,3,4,5]

    Example 2:
    Input: head = [], val = 1
    Output: []

    Example 3:
    Input: head = [7,7,7,7], val = 7
    Output: []
 */

class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode node1=new ListNode(-1);
        node1.next=head;
        ListNode node=node1;
        while(node.next!=null)
        {
            if(node.next.val==val)
            {
                node.next=node.next.next;
            }
            else
            {
                node=node.next;
            }
        }
        return node1.next;
    }
}