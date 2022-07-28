package DFS_BFS활용;

import java.util.Scanner;

public class B바둑이승차DFS {

    static int c;
    static int n;
    static int answer;
    static int [] arr;

    public static void DFS(int depth, int sum, int [] arr ){

        if(depth == n) {
            if( sum > c ) return;
            answer = Math.max(answer, sum);
        }
        else {
            DFS(depth+1, sum+arr[depth] , arr);
            DFS(depth +1 , sum , arr );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();

        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]  = sc.nextInt();
        }

        DFS(0,0,arr);
        System.out.println(answer);
    }
}
