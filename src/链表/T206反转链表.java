package 链表;

import leetcode.editor.cn.P206_ReverseLinkedList;

import java.util.List;

public class T206反转链表 {

   class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode reverseList(ListNode head) {
//           ListNode next=null;
//           ListNode prev=null;
//            while(head!=null){
//                next=head.next;
//                head.next=prev;
//                prev=head;
//                head=next;
//            }
//            return prev;
//        }
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
