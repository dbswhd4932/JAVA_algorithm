package DFS_BFS기초;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class M그래프최단거리_BFS {

    static int n, m;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch, dis; // 방문했는지, 최단경로

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        ch[v] = 1; // 체크 1번
        dis[v] = 0;
        queue.offer(v);
        while (!queue.isEmpty()) {
            int cv = queue.poll();
            for (int nv : graph.get(cv)) {
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    queue.offer(nv);
                    dis[nv] = dis[cv] + 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //정점의개수
        m = sc.nextInt(); // 간선의개수
        // 인접리스트
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        ch = new int[n + 1];
        dis = new int[n + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }
        bfs(1);
        for (int i = 2; i <= n; i++) {
            System.out.println(i + " : " + dis[i]);

        }
    }
}
