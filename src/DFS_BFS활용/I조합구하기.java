package DFS_BFS활용;

import java.util.Scanner;

public class I조합구하기 {

    static int n;
    static int m;
    static int [] arr;

    public static void DFS(int depth, int a) {
        if(depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = a; i <= n; i++) {
                arr[depth] = i;
                DFS(depth+1, i+1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        arr = new int [m];

        DFS(0,1);

    }
}
