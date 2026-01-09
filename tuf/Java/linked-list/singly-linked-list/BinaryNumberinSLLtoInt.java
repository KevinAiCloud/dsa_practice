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
    Input: head = [1,0,1]
    Output: 5
    Explanation: (101) in base 2 = (5) in base 10

    Example 2:
    Input: head = [0]
    Output: 0

 */
class BinaryNumberinSLLtoInt {
    public int getDecimalValue(ListNode head) {
        ListNode node=head,node1=head;
        double i=0,val=0;
        while(node!=null){
            i++;
            node=node.next;
        }
        i=i-1;
        while(node1!=null){
            val=val+((node1.val)*Math.pow(2,i));
            i--;
            node1=node1.next;
        }
        int val1=(int) val;
        return val1;
    }
}