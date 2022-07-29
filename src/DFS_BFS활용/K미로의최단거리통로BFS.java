package DFS_BFS활용;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class K미로의최단거리통로BFS {

    static int[][] board;
    static int[][] dis;
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<Point> Q = new LinkedList<>();

    public static void BFS(int x, int y) {
        Q.offer(new Point(x, y));
        board[1][1] = 1;//출발점 체크
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] != 1) {
                    board[nx][ny] = 1;
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1; // 주의
                    Q.offer(new Point(nx, ny));
                    if (board[nx][ny] == board[7][7]) {
                        System.out.println(dis[nx][ny]);
                        return;
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        BFS(1, 1);
        if(dis[7][7] == 0) {
            System.out.println(-1);
        }
    }
}
