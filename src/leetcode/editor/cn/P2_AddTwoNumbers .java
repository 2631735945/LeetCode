//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
// 
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
//
// Related Topics 递归 链表 数学 👍 8422 👎 0


package leetcode.editor.cn;

/**
 * 两数相加
 * @author DY
 * @date 2022-08-01 16:53:53
 */
public class P2_AddTwoNumbers{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P2_AddTwoNumbers().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

// Definition for singly-linked list.
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
//        第一阶段
        while (curs!=null){
             num=curl.val+curs.val+carry;
            curl.val=num%10;
            carry=num/10;
            last=curl;
            curl=curl.next;
            curs=curs.next;
        }
//        第二阶段
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

}
