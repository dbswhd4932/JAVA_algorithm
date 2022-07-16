package 배열1_2차원;

import java.util.Scanner;

public class 격자판최대합9O {
    static int solution(int n , int [][] arr ) {
        int answer =0;

        int [] aArr = new int [n];
        int [] bArr = new int [n];

        int aMax = 0; // 가로
        int bMax = 0; // 세로
        int c = 0;
        int d = 0;

        //가로합 -> aArr 배열에 추가
        for (int i = 0; i < n; i ++ ) {
            for (int j = 0; j < n; j++) {
                aArr[i] += arr[i][j];
            }
        }
        for (int i = 0; i < aArr.length; i++) {
            if(aMax < aArr[i]) {
                aMax = aArr[i];
            }
        }

        //세로합 -> bArr 배열에 추가
        for (int i = 0; i < n; i ++ ) {
            for (int j = 0; j < n; j++) {
                bArr[i] += arr[j][i];
            }
        }
        for (int i = 0; i < bArr.length; i++) {
            if(bMax < bArr[i]) {
                bMax = bArr[i];
            }
        }

        // 우하향 대각선
        for (int i = 0; i < n; i++) {
            for (int j = i; j <= i; j++) {
                c += arr[i][j];
            }
        }

        // 좌하향 대각선
        for (int i = n-1; i >= 0; i--) {
            for (int j = i; j <= i; j++) {
                d += arr[i][j];
            }
        }

        int [] maxArr = new int[] {aMax , bMax , c, d};

        for (int i = 0; i < maxArr.length; i++) {
            if(answer < maxArr[i]) {
                answer = maxArr[i];
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] arr = new int [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(solution(n,arr));

    }
}
