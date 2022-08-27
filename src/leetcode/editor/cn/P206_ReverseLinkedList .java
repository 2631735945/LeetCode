//给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
//
// 
// 
// 
// 
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,3,4,5]
//输出：[5,4,3,2,1]
// 
//
// 示例 2： 
// 
// 
//输入：head = [1,2]
//输出：[2,1]
// 
//
// 示例 3： 
//
// 
//输入：head = []
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 链表中节点的数目范围是 [0, 5000] 
// -5000 <= Node.val <= 5000 
// 
//
// 
//
// 进阶：链表可以选用迭代或递归方式完成反转。你能否用两种方法解决这道题？ 
//
// Related Topics 递归 链表 👍 2666 👎 0


package leetcode.editor.cn;
//Class 'P206_ReverseLinkedList' is public, should be declared in a file named 'P206_ReverseLinkedList.java'
/**
 * 反转链表
 * @author DY
 * @date 2022-08-02 16:40:22
 */
public class P206_ReverseLinkedList{

	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P206_ReverseLinkedList().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

//  Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode reverseList(ListNode head) {
    	ListNode next=null;
    	ListNode prev=null;
    	while(head!=null){
    		next=head.next;
    		head.next=prev;
    		prev=head;
    		head=next;
		}
    	return prev;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
