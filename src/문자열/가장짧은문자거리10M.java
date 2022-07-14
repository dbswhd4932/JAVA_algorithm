package 문자열;

import java.util.Scanner;

public class 가장짧은문자거리10M {
    public static int[] solution(String s, char t) {
        int [] arr = new int [s.length()];
        int a = 1000;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t) {
                a = 0;
                arr[i] = a;
            } else {
                a++;
                arr[i] = a;
            }
        }

        a = 1000;
        for (int i = s.length()-1; i >= 0 ; i--) {
            if(s.charAt(i) == t) a = 0;
            else {
                a++;
                if(arr[i] > a) {
                    arr[i] = a;
                }
            }
        }

        return arr;
    }
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char t = sc.next().charAt(0);
        int[] answer = solution(s, t);
        for(int x : answer) {
            System.out.print(x+ " ");
        }
    }
}
