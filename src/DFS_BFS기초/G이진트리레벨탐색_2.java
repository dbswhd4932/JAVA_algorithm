package DFS_BFS기초;

import java.util.LinkedList;
import java.util.Queue;

class Node2 {
    int data;
    Node2 lt, rt;

    Node2(int val) {
        this.data = val;
        lt = rt = null;
    }
}

public class G이진트리레벨탐색_2 {

    Node2 root;

    static void BFS(Node2 root){
        Queue<Node2> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while(!Q.isEmpty()) {
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node2 cur = Q.poll();
                System.out.print(cur.data + " ");
                if(cur.lt != null) {
                    Q.offer(cur.lt);
                } else {
                    if(cur.rt != null) {
                        Q.offer(cur.rt);
                    }
                }
            }
            L++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        G이진트리레벨탐색_2 tree = new G이진트리레벨탐색_2();
        tree.root = new Node2(1);
        tree.root.lt = new Node2(2);
        tree.root.rt = new Node2(3);
        tree.root.lt.lt = new Node2(4);
        tree.root.lt.rt = new Node2(5);
        tree.root.rt.lt = new Node2(6);
        tree.root.rt.rt = new Node2(7);
        BFS(tree.root);

    }
}
