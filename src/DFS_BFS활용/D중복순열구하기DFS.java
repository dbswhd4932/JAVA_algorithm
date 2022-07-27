package DFS_BFS활용;

import java.util.Scanner;

public class D중복순열구하기DFS {

    //1부터 N까지 번호가 적힌 구슬이 있습니다.
    // 이 중 중복을 허락하여 M번을 뽑아 일렬로 나열하는 방법을 모두 출력합니다
    static int [] arr;

    public static void DFS(int depth , int n , int m ){
        if(depth == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        else {
            for (int i = 1; i <= n; i++) {
                arr[depth] = i;
                DFS(depth+1, n,m);
            }
        }
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        arr = new int [m];
        DFS(0,n,m);

    }
}

//입력예제
//3(n) 2(m)
//출력예제
//1 1
//1 2
//1 3
//2 1
//2 2
//2 3
//3 1
//3 2
//3 3
