package DFS_BFS기초;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H송아지찾기BFS {
    int answer = 0;
    static int[] dis = {1, -1, 5};
    static int[] ch; // 체크배열
    static Queue<Integer> Q = new LinkedList<>();

    static int BFS(int s, int e) {
        ch = new int[100001];
        ch[s] = 1; //첫번째 지점
        Q.offer(s);
        int L = 0; //레벨값
        while (!Q.isEmpty()) {
            int len = Q.size(); // 사이즈만큼 반복해야 노드자식을 알수 있다.
            for (int i = 0; i < len; i++) {
                int x = Q.poll();

                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (x == e) return L;
                    if (nx > 1 && nx <= 10000 && ch[nx] == 0) { // 방문X
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return L;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(BFS(s,e));
    }
}
