package 배열1_2차원;

import java.util.ArrayList;
import java.util.Scanner;

public class 뒤집은소수6O {
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
        int[] c = new int[n]; // 배열을 뒤집어서 저장할 배열 생성
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0) {
                c[i] = c[i] * 10 + arr[i] % 10;
                arr[i] = arr[i] / 10;
            }
        }
        for (int i = 0; i < c.length; i++) {
            if (isPrime(c[i]) == false) {
                answer.add(c[i]);
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
        for (int x : solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
