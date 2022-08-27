//给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
//
// 
//
// 示例 1： 
// 
// 
//输入：head = [1,2,6,3,4,5,6], val = 6
//输出：[1,2,3,4,5]
// 
//
// 示例 2： 
//
// 
//输入：head = [], val = 1
//输出：[]
// 
//
// 示例 3： 
//
// 
//输入：head = [7,7,7,7], val = 7
//输出：[]
// 
//
// 
//
// 提示： 
//
// 
// 列表中的节点数目在范围 [0, 10⁴] 内 
// 1 <= Node.val <= 50 
// 0 <= val <= 50 
// 
//
// Related Topics 递归 链表 👍 981 👎 0


package leetcode.editor.cn;

import org.w3c.dom.NodeList;

/**
 * 移除链表元素
 * @author DY
 * @date 2022-08-02 14:58:56
 */
public class P203_RemoveLinkedListElements{
	 public static void main(String[] args) {
	 	 //测试代码
	 	 Solution solution = new P203_RemoveLinkedListElements().new Solution();
	 }
	 
//力扣代码
//leetcode submit region begin(Prohibit modification and deletion)

// Definition for singly-linked list.
  public static class ListNode {
    int val;
      ListNode next;
      ListNode() {}
      public ListNode(int val) { this.val = val; }ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode removeElements(ListNode head, int val) {
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
    	return dummyNode.next	;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
