package DFS_BFS기초;

public class C팩토리얼_완료 {
    static int DFS(int n ) {
        if(n == 0 ) return 1;
        else {
            return n * DFS(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(DFS(5));
    }
}
