package DFS_BFS기초;

public class F부분집합구하기_DFS_2 {

    static int n;
    static int[] ch; // 0 or 1

    public static void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += i + " ";
                }
            }
            System.out.println(tmp);

        } else {
            ch[L] = 1;
            DFS(L + 1);
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        n = 3;
        ch = new int[n + 1];
        DFS(1);
    }
}
