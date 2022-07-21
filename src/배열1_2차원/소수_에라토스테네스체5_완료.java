package 배열1_2차원;

import java.util.Scanner;

public class 소수_에라토스테네스체5_완료 {
    static int solution(int n) {
        int answer = 0;
        boolean [] arr = new boolean[n+1];
        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i < n+1; i++) {
            for (int j = i*i; j < n+1; j+= i) {
                arr[j] = true;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == false) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solution(n));
    }
}
