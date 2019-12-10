package LeetCode;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/10 08:48
 * Description:
 *
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 *
 * 给定的 n 保证是有效的。
 *
 * 做题思路：
 * 先设置一个假结点指向头结点 head
 * 然后遍历出链表的长度length
 * 此时length-n+1 即为 需要删除的结点位置
 * 把first结点再向假结点 位置重置
 * 再次循环 length-n ---- length-n+2 （跳过需要删除的结点地址）
 * 得出结果
 *
 */
public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //设置一个假结点  指向头结点
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //
        int length = 0;
        ListNode first = head;
        while(first!=null){
            length++;
            first = first.next;
        }

        first = dummy;
        length = length - n;

        while (length>0){
            length--;
            first = first.next;
        }

        first.next = first.next.next;

        return dummy.next;
    }
}
