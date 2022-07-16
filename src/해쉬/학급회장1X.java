package 해쉬;

import java.util.Scanner;

public class 학급회장1X {
    static char solution(int n, String s) {
        char answer = 0;
        char[] c = s.toCharArray();
        int[] count = new int[5];
        for (int i = 0; i < c.length; i++) {
            count[c[i] - 'A']++;
        }

        int max = 0;
        int i = 0;
        for (i = 0; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
            }
        }
        answer = (char) (62+i);


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));

    }
}
