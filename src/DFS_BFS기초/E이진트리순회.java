package DFS_BFS기초;

class Node {
    int data;
    Node lt, rt;

    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}

public class E이진트리순회 {
    Node root;

    public static void DFS(Node root) {
        if (root == null) return; // 종료
        else {
            System.out.print(root.data + " "); // 전위
            DFS(root.lt); // 왼쪽
            System.out.print(root.data + " "); // 중위
            DFS(root.rt); // 오른쪽
            System.out.print(root.data + " "); // 후위
        }

    }

    public static void main(String[] args) {
        E이진트리순회 tree = new E이진트리순회();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        DFS(tree.root);
    }
}

