package DFS_BFS기초;


class Node3 {
    int data;
    Node lt;
    Node rt;

    public Node3(int val) {
        this.data = val;
        lt = rt = null ;
    }
}

public class ITree말단노드까지의가장짧은경로DFS {
    Node root;
    public int DFS(int L , Node root) {
//        if(root.lt == null && root.rt == null ) {
            return L;
//        } else {
//            return Math.min(DFS(L+1 , root.lt), DFS(L+1, root.rt));
        }
//    }


    public static void main(String[] args) {
        ITree말단노드까지의가장짧은경로DFS tree = new ITree말단노드까지의가장짧은경로DFS();
        tree.root = new Node(1);
//        tree.root.lt = new Node(2);
//        tree.root.rt = new Node(3);
//        tree.root.lt.lt = new Node(4);
//        tree.root.lt.rt = new Node(5);
        System.out.println(tree.DFS(0, tree.root));

    }
}
