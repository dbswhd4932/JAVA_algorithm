package 문자열;

import java.util.Scanner;

public class 숫자만추출9A {
    public static int solution(String str) {
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            if( 48 <= str.charAt(i) && str.charAt(i) <= 57) {
                answer = answer * 10 + ( str.charAt(i) -48);
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
