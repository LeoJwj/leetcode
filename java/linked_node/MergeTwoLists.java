package leo.com.testlib.ALeetcode.linked_node;


/**
 * 合并两个有序链表
 * <p>
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeTwoLists {

    /**
     * 解题思路：
     * 引入一个head 节点和一个temp节点。
     * head.next节点是最后返回节点。
     * temp节点是参与到遍历的节点。
     *
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            } else {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
        }
        if (l1 != null) {
            temp.next = l1;
        }
        if (l2 != null) {
            temp.next = l2;
        }
        return head.next;
    }
}
