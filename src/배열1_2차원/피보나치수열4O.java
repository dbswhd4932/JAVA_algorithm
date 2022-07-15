package 배열1_2차원;

import java.util.Scanner;

public class 피보나치수열4O {
    static int[] solution(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : solution(n)) {
            System.out.print(x + " ");
        }
    }
}
