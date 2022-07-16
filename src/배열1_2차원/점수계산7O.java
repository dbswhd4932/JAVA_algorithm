package 배열1_2차원;

import java.util.Scanner;

public class 점수계산7O {
    static int solution(int n, int[] arr) {
        int answer = 0;
        int score = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                answer += score;
                score++;
            } else {
                score = 1;
            }
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
        System.out.println(solution(n, arr));

    }
}
