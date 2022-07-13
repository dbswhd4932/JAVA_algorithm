package 문자열;

import java.util.Scanner;

public class 회전문자열7A {
    public static String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();
        for (int i = 0; i < len/2; i++) {
            if(str.charAt(i) != str.charAt(len-i-1)) {
                answer = "NO";
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
