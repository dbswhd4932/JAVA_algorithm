package 문자열;

import java.util.Scanner;

public class 문장속단어3 {

    public static String solution(String str) {
        String answer = "";
        String[] s = str.split(" ");

        int max = 0;
        for (String x : s) {
            int len = x.length();
            if (max < len) {
                max = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String answer = solution(str);
        System.out.println(answer);
    }
}
