class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode x = new ListNode(0);
        x.next = head;
        ListNode curr = x;
        while(curr.next!=null){
            if(curr.next.val == val){
                curr.next = curr.next.next;
            }else{
                curr = curr.next;
            }
        }
        return x.next;
    }
}