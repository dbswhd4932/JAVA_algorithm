package 문자열;

import java.util.Scanner;

public class 암호12X {
    static String solution(int n ,String s) {
        String answer = "";
        s = s.replace("#", "1").replace("*", "0");
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0,7);
            s = s.substring(7);

            int num = Integer.parseInt(tmp,2);
            answer += (char)num;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));

    }
}
