package 문자열;

import java.util.Scanner;

public class 문자찾기1 {
    public static int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        char[] chars = str.toCharArray();
        for (char x : chars) {
            if(x == t ) {
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.next().charAt(0);
        System.out.println(solution(str, c));

    }
}

