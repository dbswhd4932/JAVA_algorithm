package DFS_BFS활용;

import java.util.Scanner;

public class B바둑이승차DFS {

    static int c;
    static int n;
    static int answer;
    static int[] arr;

    public static void DFS(int L, int sum, int[] arr) {

        if (sum > c) return;

        if (L == n) { // 레벨이 높이와 같아지면
            answer = Math.max(answer , sum);
        } else {
            DFS(L + 1, sum + arr[L], arr);
            DFS(L + 1, sum, arr);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();

        arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
