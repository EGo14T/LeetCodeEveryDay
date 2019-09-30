package LeetCode;

/**
 * @author 王富昕
 * Create By EGo1ST
 * Date ：Created in 2019/9/7 13:00
 * Description：
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null){
            return l1;
        }
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        //  2 + 5 = 7    val = 7 ; carry = 0
        //  4 + 6 = 10   val = 0 ; carry = 1
        //  3 + 4 + carry(1) = 8 ; val = 8 , carry = 0;
        //  三位数加三位数
        while (l1 != null && l2 != null){
            int sum = l1.val+l2.val+carry;
            int val = sum%10;
            carry = sum/10;
            //当前结点赋值 val
            ListNode newnode = new ListNode(val);
            //头结点指向当前节点
            current.next = newnode;
            //移动到下一个结点
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }

        //两个链表长度不一样
        while (l1 != null){
            int sum = l1.val + carry;
            int val = sum%10;
            carry = sum/10;
            current.next = new ListNode(val);
            //移动到下一个结点
            current = current.next;
            l1 = l1.next;
        }

        while (l2 != null){
            int sum = l2.val + carry;
            int val = sum%10;
            carry = sum/10;
            current.next = new ListNode(val);
            //移动到下一个结点
            current = current.next;
            l2 = l2.next;
        }

        if (carry == 1 ){
            current.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
