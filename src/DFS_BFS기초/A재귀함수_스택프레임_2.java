package DFS_BFS기초;

public class A재귀함수_스택프레임_2 {
    static void DFS(int n) {
        if(n == 0 ) return;
        else {
            DFS(n-1);
            System.out.print(n + " ");
        }

    }

    public static void main(String[] args) {
        DFS(3);
    }
}
