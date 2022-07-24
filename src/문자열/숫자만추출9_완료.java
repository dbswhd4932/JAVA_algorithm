package 문자열;

import java.util.ArrayList;
import java.util.Scanner;

public class 숫자만추출9_완료 {
    public static int solution(String str) {
        int answer = 0;

        ArrayList<Integer> list = new ArrayList<>();

        char [] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
           if( '0' <= c[i] && '9' >= c[i]) {
                list.add((int) c[i] - 48);
           }
        }

        for (int i = 0; i < list.size(); i++) {
            answer = answer * 10 + list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
