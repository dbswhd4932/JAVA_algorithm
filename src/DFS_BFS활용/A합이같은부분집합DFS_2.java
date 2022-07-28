package DFS_BFS활용;

import java.util.Scanner;

public class A합이같은부분집합DFS_2 {

    static String answer = "NO";
    static int n;
    static int[] arr;
    static int total;

    public static void DFS(int depth, int sum, int[] arr) {
        if (depth == n) {
            if ((total - sum) == sum) {
                answer = "YES";
            }
        }
        else {
            DFS(depth + 1, sum + arr[depth], arr);
            DFS(depth + 1, sum, arr);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        arr = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        DFS(0,0,arr);
        System.out.println(answer);

    }
}
