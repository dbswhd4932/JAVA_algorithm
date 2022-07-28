package DFS_BFS활용;

import java.util.Scanner;

public class F순열구하기_2 {
    //10이하의 N개의 자연수가 주어지면
    //이 중 M개를 뽑아 일렬로 나열하는 방법을 모두 출력합니다.
    static int n;
    static int m;
    static int[] arr; // 입력받을배열
    static int[] answerArr; // 정답배열
    static boolean[] visit; //방문체크

    public static void DFS(int depth, int n, int m, int[] arr) {
        if (depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(answerArr[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 0; i < n; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    answerArr[depth] = arr[i];
                    DFS(depth + 1, n, m, arr);
                    visit[i] = false;
                }
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int[n];
        visit = new boolean[n];
        answerArr = new int[m];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0, n, m, arr);


    }
}

