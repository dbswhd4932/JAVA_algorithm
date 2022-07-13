package 문자열;

import java.util.Scanner;

public class 팰린드롬8X {
    public static String solution(String str) {
        str = str.toUpperCase();
        String answer = "NO";

        for (int i = 0; i < str.length()/2; i++) {
            if('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
                if(str.charAt(i) == str.charAt(str.length()-1-i)) {
                    answer = "YES";
                }
            } else {
                continue;
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
