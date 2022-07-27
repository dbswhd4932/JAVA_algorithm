package DFS_BFS활용;

import java.util.Scanner;

public class F순열구하기 {
    //10이하의 N개의 자연수가 주어지면
    //이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
    static int n;
    static int m;
    static boolean[] visit; // 방문여부 배열
    static int[] arr; // 예제 입력받는 배열
    static int[] answer; // 출력배열

    public static void DFS(int depth) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(answer[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 0; i < n; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    answer[depth] = arr[i];
                    DFS(depth + 1);
                    visit[i] = false;
                }
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        answer = new int [m];
        arr = new int[n];
        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0);
    }
}

