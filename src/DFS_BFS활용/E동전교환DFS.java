package DFS_BFS활용;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class E동전교환DFS {

    static int n; // 동전 종류
    static int m; // 금액
    static int answer = Integer.MAX_VALUE; // 사용횟수

    public static void DFS(int depth, int sum, Integer[] arr) {
        if (sum > m) return;
        if (answer <= depth) return; // 효율증가
        if (sum == m) {
            answer = Math.min(answer, depth);

        }
        else {
            for (int i = 0; i < n; i++) {
                DFS(depth + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr,Collections.reverseOrder()); // 효율성증가
        // 객체타입으로 변경 int [] -> Integer []

        m = sc.nextInt();

        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
