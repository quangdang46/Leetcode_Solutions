class Solution {
    
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    
    public int getDecimalValue(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while(head != null) {
            sb.append(head.val);
            head = head.next;
        }
        return Integer.parseInt(sb.toString(), 2);
    }
    public static void main(String[] args) {
        ListNode n1= new ListNode(1);
        ListNode n2= new ListNode(0);
        ListNode n3= new ListNode(1);
        n1.next=n2;
        n2.next=n3;
        System.out.println(new Solution().getDecimalValue(n1));

    }
}



class Solution {
    public int getDecimalValue(ListNode head) {
        
        int num = head.val;
        
        while(head.next != null){
            num = num * 2 + head.next.val;
            head = head.next;
        }
        return num;
    }
}