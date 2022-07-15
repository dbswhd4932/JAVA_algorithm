package 배열1_2차원;

import java.util.Scanner;

public class 소수_에라토스테네스체5_1 {
    static int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];
        for (int i = 2; i < n + 1; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j < n + 1; j += i) {
                    arr[j] = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
