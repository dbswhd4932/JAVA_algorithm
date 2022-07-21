package 배열1_2차원;

import java.util.Scanner;

public class 보이는학생2_완료 {
    static int solution(int n, int[] arr) {
        int answer = 1; // 첫번째 학생은 무조건 확인가능
        int max = arr[0]; // 첫번째 학생이 기준
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(solution(n, arr));
    }
}
