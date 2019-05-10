package leo.com.testlib.ALeetcode.linked_node;

/**
 反转一个单链表。

 示例:

 输入: 1->2->3->4->5->NULL
 输出: 5->4->3->2->1->NULL
 进阶:
 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
class ReverseList {

    /**
     * 思路：
     * 利用三个指针来完成交换。
     * left指针指向链表的最左边
     * right指向left的下一个节点
     * temp指针是为了记录right指针的下一个节点，防止丢失节点信息。
     *
     * 循环外做的操作：
     * 1.初始化left，right指针
     * 2.head.next变成链表尾。
     * 3.temp指向right指针。
     *
     * 循环内做的事情。
     * 1。temp指针记录right。next节点位置。
     * 2。right。next指向left，完成翻转
     * 3。left和right指针都向后移动一位
     * 4。循环终止条件是right指针指向了null
     *
     * 最后left指针位于的位置就是头节点。
     *
     */
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode left = head;
        ListNode right = left.next;
        head.next = null;
        ListNode temp = right;
        while(right != null){
            temp = right.next;
            right.next = left;
            left = right;
            right = temp;
        }
        head = left;
        return head;
    }
}
