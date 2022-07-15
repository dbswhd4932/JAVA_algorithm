package 배열1_2차원;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수6_2A {
    public static boolean isPrime(int num) {
        if (num == 1) return true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return true;
            }
        }
        return false;
    }

    static ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0;
            while (tmp > 0) {
                res = res * 10 + tmp % 10;
                tmp = tmp / 10;
            }
            if( !isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
