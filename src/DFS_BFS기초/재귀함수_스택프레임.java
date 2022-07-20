package DFS_BFS기초;

public class 재귀함수_스택프레임 {
    static void DFS(int n) {

        // **** 스택의 상단이 작동한다 ****
        if (n == 0) return;
        else {
            DFS(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        DFS(3);
    }
}
