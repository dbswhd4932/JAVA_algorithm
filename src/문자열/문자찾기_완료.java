package 문자열;

import java.util.Scanner;

public class 문자찾기_완료 {
    static int solution(String str, char c) {
        int answer = 0;

        for (String s : str.split("")) {
            if(s.equalsIgnoreCase(String.valueOf(c))) {
                answer ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char c = sc.nextLine().charAt(0);

        System.out.println(solution(str, c));
    }
}
