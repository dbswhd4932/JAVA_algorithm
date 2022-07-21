package 문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기4_완료 {
    public static ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        for (String s : str) {
            char[] c = s.toCharArray();
            for (int i = 0; i < c.length / 2; i++) {
                char tmp = c[i];
                c[i] = c[c.length - 1 - i];
                c[c.length - 1 - i] = tmp;
            }
            String a = String.valueOf(c);
            answer.add(a);
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for (String s : solution(n, str)) {
            System.out.println(s);
        }


    }
}
