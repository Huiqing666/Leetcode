/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        /*
        ListNode h1 = l1, h2 = l2;
        int m = 0, n = 0;
        while(l1 != null){
            l1 = l1.next;
            m++;
        }
        while(l2 != null){
            l2 = l2.next;
            n++;
        }
        if(m > n){
            l1 = h1;
            l2 = h2;
        }else{
            l1 = h2;
            l2 = h1;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = l1;
        ListNode first = dummy;
        
        while(m > n){
            m--;
            first = first.next; 
        }
        while(n > m){
            n--;
            first = first.next; 
            
        }
        System.out.println(first.next.val);
        System.out.println(l2.val);
        while(first.next != null){
            if(first.next.val + l2.val > 9){
                first.val++;
                if(first.val > 9){
                    ListNode temp = new ListNode(0);
                    first.val = 1;
                    temp.next = first.next;
                    first.next = temp;
                    first = temp;
                }
                first.next.val = first.next.val + l2.val - 10;
            }else{
                first.next.val = first.next.val + l2.val;
            }
            first = first.next;
            l2 = l2.next;
            
        }
        if(dummy.val > 0)return dummy;
        return dummy.next;
        */
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        
        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }
        
        int sum = 0;
        ListNode list = new ListNode(0);
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            list.val = sum % 10;
            ListNode head = new ListNode(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }
        
        return list.val == 0 ? list.next : list;
        
    }
}
