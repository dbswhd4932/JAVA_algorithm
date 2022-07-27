package DFS_BFS기초;

import java.util.Scanner;

public class F부분집합구하기_DFS_4 {

    static int n;
    static int[] ch;

    public static void dfs(int L) {
        if (L == n + 1) {
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == 1) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        } else {
            ch[L] = 1;
            dfs(L + 1);
            ch[L] = 0;
            dfs(L + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = 3;

        ch = new int[n + 1];
        dfs(1);
    }
}
