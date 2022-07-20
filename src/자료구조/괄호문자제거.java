package 자료구조;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {
    static String solution(String str) {
        String answer = " ";
        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == ')') {
                while (st.pop() != '(');
            } else {
                st.push(c);
            }
        }
        for (int i = 0; i < st.size(); i++) {
            answer += st.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));
    }
}
