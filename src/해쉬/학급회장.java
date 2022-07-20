package 해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
    static char solution(int n, String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            map.put(c[i] , map.getOrDefault(c[i] , 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for(char x : map.keySet()) {
            if(max < map.get(x)) {
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(solution(n, str));

    }
}
