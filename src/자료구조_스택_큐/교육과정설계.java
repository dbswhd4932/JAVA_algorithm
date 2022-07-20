package 자료구조_스택_큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계 {

    static String solution(String need, String plan) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for (char x : need.toCharArray()) {
            queue.offer(x);
        }

        for (char x : plan.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String str = sc.next();
        System.out.println(solution(s, str));
    }
}
