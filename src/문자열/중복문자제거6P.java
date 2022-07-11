package 문자열;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class 중복문자제거6P {
    public static String solution(String str) {
        String answer = "";

        String[] strArr = str.split("");

        Set<String> set = new LinkedHashSet<>();
        for (String s : strArr) {
            set.add(s);
        }
        for (String s : set) {
            answer += s;
        }

        return answer;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));


    }
}
