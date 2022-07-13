package 문자열;

import java.util.Scanner;

public class 회전문자열7A2 {
    public static String solution(String str) {
        String answer = "YES";

        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
