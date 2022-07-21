package 문자열;

import java.util.Scanner;

public class 대소문자변환2_완료 {

    public static String solution(String str) {
        String answer = "";

        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && 'Z' >= c[i]) {
                c[i] = (char) (c[i] + 32);
            } else {
                c[i] = (char) (c[i] - 32);
            }
            answer += c[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String answer = solution(s);
        System.out.println(answer);
    }
}
