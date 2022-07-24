package DFS_BFS기초;

public class B이진수출력_재귀 {
    static void DFS(int n) {

        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        DFS(11);
    }
}
