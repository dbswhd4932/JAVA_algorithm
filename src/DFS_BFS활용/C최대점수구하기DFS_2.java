package DFS_BFS활용;

import java.util.Scanner;

public class C최대점수구하기DFS_2 {

    static int n; // 문제개수
    static int m; // 제한시간
    static int[] score; // 문제당 점수
    static int[] time; // 문제당 시간
    static int anwer; // 정답

    public static void DFS(int depth, int sum, int time, int[] sc, int[] st) {
        if (depth == n) {
            if(time > m ) return;
            anwer = Math.max(anwer , sum);

        } else {
            DFS(depth + 1, sum + sc[depth], time + st[depth], sc, st);
            DFS(depth + 1, sum, time, sc, st);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        score = new int[n];
        time = new int[n];

        for (int i = 0; i < n; i++) {
            score[i] = sc.nextInt();
            time[i] = sc.nextInt();
        }

        DFS(0,0,0,score,time);
        System.out.println(anwer);

    }
}
