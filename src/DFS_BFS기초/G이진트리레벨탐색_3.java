package DFS_BFS기초;

import java.util.LinkedList;
import java.util.Queue;


public class G이진트리레벨탐색_3 {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    Node root;

    public static void bfs(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.left != null) {
                    Q.offer(cur.left);
                }
                if (cur.right != null) {
                    Q.offer(cur.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        G이진트리레벨탐색_3 tree = new G이진트리레벨탐색_3();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);
        bfs(tree.root);

    }
}
