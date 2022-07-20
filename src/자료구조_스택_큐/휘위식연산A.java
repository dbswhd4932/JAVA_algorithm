package 자료구조_스택_큐;

import java.util.Scanner;
import java.util.Stack;

public class 휘위식연산A {
    static int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(char c : str.toCharArray()) {
            if(Character.isDigit(c)) stack.push(c-48);
            else {
                int rt = stack.pop();
                int lt = stack.pop();
                if(c == '+') stack.push(lt+rt);
                else if(c == '-') stack.push(lt-rt);
                else if(c == '/') stack.push(lt/rt);
                else if(c == '*') stack.push(lt*rt);
            }
            answer = stack.get(0);
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(solution(str));

    }
}

