package DFS_BFS기초;

public class A재귀함수_스택프레임_완료 {
    static void DFS(int n) {
        if(n == 0 ) return ;
        else {
            DFS(n-1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        DFS(3);
    }
}
