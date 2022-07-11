package 문자열;

import java.util.Scanner;

public class 문장속단어3P {

    public static String solution(String str) {

        String answer = "";
        String[] strArr = str.split(" ");

        int max = 0;
        for (String s : strArr) {
            int len = s.length();
            if(len > max) {
                max = len;
                answer = s;
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
