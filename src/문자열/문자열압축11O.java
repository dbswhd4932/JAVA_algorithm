package 문자열;

import java.util.Scanner;

public class 문자열압축11O {
    public static String solution(String str) {
        String answer = "";
        int cnt = 1;
        str += " ";

        char [] c = str.toCharArray();
        for(int i =0; i<str.length()-1; i++) {
            if(c[i] == c[i+1]) {
               cnt++;
            } else {
                answer += c[i];
                if(cnt >= 2 ) {
                    answer += cnt;
                    cnt =1;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            System.out.println(solution(str));
    }
}
