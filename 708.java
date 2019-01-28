/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val,Node _next) {
        val = _val;
        next = _next;
    }
};
*/
class Solution {
    public Node insert(Node head, int insertVal) {
        Node node = new Node();
        node.val = insertVal;
        if (head == null) {
            node.next = node;
            return node;
        }
        Node start = head;
        Node curr = head.next;
        while (true) {
            if (curr.val < curr.next.val) {
               if (insertVal >= curr.val && insertVal <= curr.next.val) {
                   node.next = curr.next;
                   curr.next = node;
                   break;
               }
            }
            else if (curr.val > curr.next.val){
                if (curr.val <= insertVal || curr.next.val >= insertVal) {
                    node.next = curr.next;
                    curr.next = node;
                    break;
                }
            }
            else {
                if (curr == start) {
                    node.next = curr.next;
                    curr.next = node;
                    break;
                }
            }
            
            curr = curr.next;
        }
        return head;
    }
}
