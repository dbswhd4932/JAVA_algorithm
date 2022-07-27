package DFS_BFS활용;

import java.util.Scanner;

public class A합이같은부분집합DFS {

    static String answer = "NO";
    static int n = 0;
    static int total = 0;
//    static boolean flag = false;

    public static void DFS(int L, int sum, int[] arr) {
//        if(flag) return;

//        if(sum > total /2 ) return; 절반이넘어가면 return 하는 조건
        if(L == n) {
            if((total-sum) == sum) {
                answer = "YES";
//                flag = true;
                return;
            }
        }
        else {
            DFS(L+1 , sum + arr[L] , arr);
            DFS(L+1 , sum , arr);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        DFS(0, 0, arr);
        System.out.println(answer);
    }
}
