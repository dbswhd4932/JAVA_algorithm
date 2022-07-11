package 문자열;

import java.util.Scanner;

public class 대소문자변환2B {

    public static String solution(String str) {
        String answer = "";
        for (char x : str.toCharArray() ) {
            if(Character.isLowerCase(x)){
                answer += Character.toUpperCase(x);
            } else {
                answer += Character.toLowerCase(x);
            }
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
