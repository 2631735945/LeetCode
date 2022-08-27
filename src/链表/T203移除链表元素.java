package 链表;

import leetcode.editor.cn.P203_RemoveLinkedListElements;

public class T203移除链表元素 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        public ListNode(int val) { this.val = val; }ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeElements(ListNode head, int val) {
//        ListNode dummyNode = new ListNode(0);
//        dummyNode.next = head;
//       ListNode prev = dummyNode;
//        while (head != null) {
//            if (head.val == val) {
//                prev.next = head.next;
//            } else {
//                prev = head;
//            }
//            head = head.next;
//
//        }
//        return dummyNode.next;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while(head!=null){
            if(head.val==val){
                prev.next=head.next;
            }   else {
                prev=head;
            }
            head=head.next;
        }

        return dummy.next;





    }

    }
