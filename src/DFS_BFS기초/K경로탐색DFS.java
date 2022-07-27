package DFS_BFS기초;

import java.util.Scanner;

public class K경로탐색DFS {

    static int n;
    static int m;
    static int answer = 0;
    static int[][] graph;
    static int[] ch;

    public static void DFS(int v) {
        if (v == n) answer++;
        else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) { // 1 이고 방문X
                    ch[i] = 1;
                    DFS(i);
                    // back 한 지점
                    ch[i] = 0; // 다시 0으로 바꾼다.
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        graph = new int[n + 1][n + 1]; // 1번부터 n 번까지
        ch = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a][b] = 1;
        }

        ch[1] = 1;
        DFS(1); // 출발점
        System.out.println(answer);

    }
}
