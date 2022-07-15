package 배열1_2차원;

import java.util.Scanner;

public class 피보나치수열4_2O {
    static void solution(int n) {
        int a = 1;
        int b = 1;
        int answer = 0;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            answer = a + b;
            a = b;
            b = answer;
            System.out.print(answer + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solution(n);
    }
}
