package 链表;

import java.util.List;

public class 反转链表 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        public ListNode(int val) { this.val = val; }ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode prev=null;
            ListNode Next=null;

            while(head!=null){
                Next=head.next;
                head.next=prev;
                prev=head;
                head=Next;
            }
            return prev;
        }

    }
}
