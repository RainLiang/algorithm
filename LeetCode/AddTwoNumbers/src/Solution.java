/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1; //l1的指针
        ListNode p2 = l2; //l2的指针
        int carry = 0; //进位
        ListNode lResult = null; //返回的链表
        ListNode p3 = lResult; //lResult的指针
        
        //相同长度的部分：
        while(p1 != null && p2 != null)
        {
            int add = p1.val + p2.val + carry;
            if(add < 10)
            {
                carry = 0;
            }
            else
            {
                carry = 1;
                add -= 10;
            }
            ListNode addNode = new ListNode(add);
            if(lResult == null)
            {
                lResult = addNode;
                p3 = addNode;
            }
            else
            {
                p3.next = addNode;
                p3 = addNode;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        
        //不同长度的部分：
        while(p1 != null)
        {
            int add = p1.val + carry;
            if(add < 10)
            {
                carry = 0;
            }
            else
            {
                carry = 1;
                add -= 10;
            }
            ListNode addNode = new ListNode(add);
            p3.next = addNode;
            p3 = addNode;
            p1 = p1.next;
        }
        
        while(p2 != null)
        {
            int add = p2.val + carry;
            if(add < 10)
            {
                carry = 0;
            }
            else
            {
                carry = 1;
                add -= 10;
            }
            ListNode addNode = new ListNode(add);
            p3.next = addNode;
            p3 = addNode;
            p2 = p2.next;
        }
        
         // 处理最后可能出现的进位
        if(p1==null && p2==null && carry!=0)
        {
            ListNode n = new ListNode(carry);
            p3.next = n;
        }
        return lResult;
    }
    
}