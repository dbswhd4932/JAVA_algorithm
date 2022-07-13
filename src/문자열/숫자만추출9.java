package 문자열;

import java.util.Scanner;

public class 숫자만추출9 {
    public static int solution(String str) {
        int answer = 0;
        str = str.toUpperCase();
        String s = new StringBuilder(str.replaceAll("[A-Z]", "")).toString();
        answer = Integer.parseInt(s);

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
