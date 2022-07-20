package 해쉬;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class 매출액의종류 {
    public static ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        int lt = 0;
        int rt = k;

        while (rt <= n) {
            for (int i = lt; i < rt; i++) {
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }
            answer.add(map.size());
            lt++;
            rt++;
            map.clear();
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : solution(n, k, arr)) {
            System.out.print(x + " ");
        }

    }
}
