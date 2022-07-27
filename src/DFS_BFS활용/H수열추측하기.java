package DFS_BFS활용;

import java.util.Scanner;

public class H수열추측하기 {

    static boolean [] visit;

    static int [][] dy = new int[35][35];
    public static int combi(int n, int r){
        if(dy[n][r] > 0) return dy[n][r];
        if( n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = combi(n-1,r-1) + combi(n-1, r);
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();


    }
}
