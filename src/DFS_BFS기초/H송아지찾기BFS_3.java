package DFS_BFS기초;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class H송아지찾기BFS_3 {
    //첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다.
    // 직선의 좌표 점은 1부터 10,000까지이다.

    static int answer;
    static int [] dir = {-1, 1 , 5}; // 움직일 수 있는 배열
    static int [] ch; // 체크배열

    public static int bfs(int s , int e) {
        Queue<Integer> Q = new LinkedList<>();
        ch = new int[10001];
        ch[s] = 1;
        Q.offer(s);
        while (!Q.isEmpty()) {
            int x = Q.poll();


        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(bfs(s,e));
        // 5, 14 -> 3
        // 8, 3 -> 5
    }
}
