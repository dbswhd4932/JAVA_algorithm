package 해쉬;

import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    static String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            if (!map.containsKey(c) || map.get(c) == 0) {
                return "NO";
            } else {
                map.put(c, map.get(c) -1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(solution(a, b));

    }
}

