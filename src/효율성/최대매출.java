package 효율성;

import java.util.Scanner;

public class 최대매출 {
    static int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;

        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i-k];
            if(answer < sum ) answer = sum;
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(solution(n, k, arr));

    }
}
