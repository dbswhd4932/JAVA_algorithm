package 문자열;

import java.util.Scanner;

public class 회문문자열7B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();
        String[] s = str.split("");

        boolean same = true;
        for (int i = 0; i < s.length/2; i++) {
            if(!s[i].equals(s[s.length-1-i])) {
                same =false;
            }
        }

        if(!same) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
