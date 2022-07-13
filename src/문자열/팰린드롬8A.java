package 문자열;

import java.util.Scanner;

public class 팰린드롬8A {
    public static String solution(String s) {
        String answer = "NO";
        // 정규식 -> 대문자 A~Z 가 아니면(^) 빈문자
        s = s.toUpperCase().replaceAll("[^A-Z]","");
        String tmp = new StringBuilder(s).reverse().toString();

        if(s.equals(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
