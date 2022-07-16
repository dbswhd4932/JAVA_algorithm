package 해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장1A {
    static char solution(int n, String s) {
        char answer = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
//        System.out.println(map.containsKey('A')); // 포함여부
//        System.out.println(map.size()); // map 의 크기
//        System.out.println(map.remove()); // map 의 key 삭제


        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (max < map.get(key)) {
                max = map.get(key);
                answer = key;
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
