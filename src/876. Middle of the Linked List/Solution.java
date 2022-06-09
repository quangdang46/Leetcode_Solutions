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
    public int getSize(ListNode node) {
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    public ListNode middleNode(ListNode head) {
        int idx=getSize(head)/2;
        ListNode node=head;
        while(idx>0){
            node=node.next;
            idx--;
        }
        return node;
    }
}



class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode p1 = head, p2 = head;
        while(p2 != null && p2.next!= null){
            p1 = p1.next;
            p2 = p2.next.next;
        }
        
        return p1;
    }
}