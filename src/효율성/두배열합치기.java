package 효율성;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 두배열합치기 {
    static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            answer.add(a[i]);
        }
        for ( int i = 0; i < m; i++) {
            answer.add(b[i]);
        }

        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        for (int x : solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
