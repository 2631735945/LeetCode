package 链表;

public class 两数相加 {
    public class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            int lenl1=length(l1);
            int lenl2=length(l2);
            ListNode l=lenl1>lenl2?l1:l2;
            ListNode s=l==l1?l2:l1;
            ListNode curl=l;
            ListNode curs=s;
            ListNode last=curl;
            int carry=0;
            int num=0;
            while(curs!=null){
                num=curl.val+curs.val+carry;
                curl.val=num%10;
                carry=num/10;
                last=curl;
                curl=curl.next;
                curs=curs.next;
            }
            while(curl!=null){
                num=curl.val+carry;
                curl.val=num%10;
                carry=num/10;
                last=curl;
                curl=curl.next;
            }
            if(carry!=0){
                last.next=new ListNode(carry);
            }
            return l;




        }
        public int length(ListNode l){
            int len=0;
            while(l!=null){
                len++;
                l=l.next;
            }

            return len;
        }
    }
}
