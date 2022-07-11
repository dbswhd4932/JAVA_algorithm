package 문자열;

import java.util.Scanner;

public class 대소문자변환2P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        char[] c = s.toCharArray();
        String answer = "";

        for (int i = 0; i < c.length; i++) {
            if('a'<= c[i] && c[i] <= 'z' ) {
                c[i] = (char) (c[i] - 32);
            } else if ('A'<= c[i] && c[i] <= 'Z' ) {
                c[i] = (char) (c[i] + 32);
            }
            answer += c[i];

        }
        System.out.println(answer);

    }
}
