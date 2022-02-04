/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        // Queue<Node> queue = new LinkedList<Node>();
        // if(root == null)
        //     return root;
        // queue.offer(root);
        // while(!queue.isEmpty())
        // {
        //     int lvl = queue.size();
        //     List
        // }
        Node main = root;
        while(root != null) {
        Node tempNode = new Node();
        Node current = tempNode;
            while(root != null) {
                if(root.left != null) {
                    current.next = root.left;
                    current = current.next;
                }
                if(root.right != null) {
                    current.next = root.right;
                    current = current.next;
                }
                root = root.next;
            }
            root = tempNode.next;
        }
        return main;
    }
}