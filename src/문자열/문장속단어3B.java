package 문자열;

import java.util.Scanner;

public class 문장속단어3B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");

        int index = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[index].length() < strArr[i].length()) {
                index = i;
            }
        }
        System.out.println(strArr[index]);
    }
}
