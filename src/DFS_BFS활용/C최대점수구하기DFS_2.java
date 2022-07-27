package DFS_BFS활용;

import java.util.Scanner;

public class C최대점수구하기DFS_2 {

    static int n;
    static int m;
    static int answer;

    public static void DFS(int depth, int sum, int time, int[] ms, int[] mt) {
        if (depth == n) {
            for (int i = 0; i < n; i++) {
                if (time > m) return;
                answer = Math.max(answer , sum);
            }
        }
        else {
            DFS(depth + 1, sum + ms[depth], time + mt[depth], ms, mt);
            DFS(depth + 1, sum, time, ms, mt);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        int[] score = new int[n];
        int[] solutionTime = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            solutionTime[i] = sc.nextInt();
        }
        DFS(0, 0, 0, score, solutionTime);
        System.out.println(answer);
    }
}
