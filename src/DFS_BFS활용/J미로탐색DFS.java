package DFS_BFS활용;

import java.util.Scanner;

public class J미로탐색DFS {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer = 0;

    public static void DFS(int x, int y) {
        if (x == 7 && y == 7) {
            answer++;
        }
        else {
            for (int i = 0; i < 4; i++) { // 4방향
                int nx = x + dx[i];
                int ny = y + dy[i];
                // 갈수 있는 방향
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1; // 지나가면 1로
                    DFS(nx, ny);
                    board[nx][ny] = 0; // 뒤로 백하면 0으로
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8]; // 7*7 격자판판
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        DFS(1, 1);
        System.out.println(answer);
    }
}
