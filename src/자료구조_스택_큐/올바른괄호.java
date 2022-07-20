package 자료구조_스택_큐;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    static String solution(String str){
        String answer = "YES";
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '(') {
                st.push(str.charAt(i));
            } else {
                if(st.isEmpty()) {
                    st.push(str.charAt(i));
                    break;
                } else {
                    st.pop();
                }
            }
        }
        if(!st.isEmpty()) {
            answer = "NO";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
