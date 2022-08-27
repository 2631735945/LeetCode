package 链表;

public class T2两数相加 {
//synchronized
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int len1=listLength(l1);
            int len2=listLength(l2);
            ListNode l=len1>len2?l1:l2;
            ListNode s=l==l1?l2:l1;
            ListNode curl=l;
            ListNode curs=s;
            ListNode last =curl;
            int num=0;
            int carry=0;
//        第一阶段 l有 s有
            while (curs!=null){
                num=curl.val+curs.val+carry;
                curl.val=num%10;
                carry=num/10;
                last=curl;
                curl=curl.next;
                curs=curs.next;
            }
//        第二阶段 l有 s无
            while(curl!=null){
                num=curl.val+carry;
                curl.val=num%10;
                carry=num/10;
                last=curl;
                curl=curl.next;
            }
//            第三阶段  l无 s无
            if(carry!=0){
                last.next=new ListNode(carry);
            }
            return l;
        }

        public  int listLength(ListNode list){
            int length=0;
            while (list!=null){
                length++;
                list=list.next;
            }
            return length;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

////    此方法无法通过超过int类型最大值的数
//    public P2_AddTwoNumbers.ListNode addTwoNumbers(P2_AddTwoNumbers.ListNode l1, P2_AddTwoNumbers.ListNode l2) {
//        int sum1=0;
//        int c1=1;
//        int sum2=0;
//        int c2=1;
//        while(l1!=null){
//            int num=l1.val;
//            sum1=sum1+c1*num;
//            c1=c1*10;
//            l1=l1.next;
//        }
//        while(l2!=null){
//            int num=l2.val;
//            sum2=sum2+c2*num;
//            c2=c2*10;
//            l2=l2.next;
//        }
//        int sum=sum1+sum2;
//        P2_AddTwoNumbers.ListNode new1=new P2_AddTwoNumbers.ListNode(sum%10);
//        sum=sum/10;
//        P2_AddTwoNumbers.ListNode dummy=new P2_AddTwoNumbers.ListNode(0);
//        dummy.next=new1;
//        while(sum>0){
//            new1.next=new P2_AddTwoNumbers.ListNode(sum%10);
//            sum=sum/10;
//            new1=new1.next;
//        }
//        return dummy.next;
//    }

}


