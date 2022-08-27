package 链表;

public class 移除链表元素 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode removeElements(ListNode head, int val){
        ListNode dummyNode=new ListNode(0);
        dummyNode.next=head;
        ListNode prev=dummyNode;
        while(head!=null){
            if(head.val==val){
                prev.next=head.next;
            }else {
                prev=head;
            }
            head=head.next;
        }

        return  dummyNode.next;
    }

}
