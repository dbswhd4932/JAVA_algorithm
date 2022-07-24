package 문자열;

import java.util.Scanner;

public class 팰린드롬8 {
    public static String solution(String s) {
        String answer = "YES";
        s = s.toUpperCase().replaceAll("[^A-Z]","");

        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length()-i-1)) {
                answer = "NO";
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
