package 자료구조_스택_큐;

import java.util.Scanner;
import java.util.Stack;

public class 후위식연산 {
    static int solution(String str) {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        for (String c : str.split("")) {
            int a = 0;
            int b = 0;
            if (c.equals("+")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                answer = b + a;
                stack.push(String.valueOf(answer));
            } else if (c.equals("-")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                answer = b - a;
                stack.push(String.valueOf(answer));
            } else if (c.equals("*")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                answer = b * a;
                stack.push(String.valueOf(answer));
            } else if (c.equals("/")) {
                a = Integer.parseInt(stack.pop());
                b = Integer.parseInt(stack.pop());
                answer = b / a;
                stack.push(String.valueOf(answer));
            } else {
                stack.push(c);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}
