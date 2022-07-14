package 문자열;

import java.util.Scanner;

public class 문자열압축11X {
    public static String solution(String str) {
        String answer = "";
        int count = 1;
        str += " "; //빈문자열을 넣어줘야 맨 마지막값 구할 수 있음.

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                answer += str.charAt(i);
                if (count >= 2) {
                    answer += count;
                    count = 1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
