package DFS_BFS기초;

public class F부분집합구하기_DFS {

    static int n; // 집합의 개수
    static int[] ch; // 체크배열 쓰는지 안쓰는지

    public static void DFS(int L) {
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if(ch[i] == 1) {
                    tmp+= (i+ " "); // 체크배열의 인덱스 번호를 출력한다.
                }
            }
            if(tmp.length() > 0) {
                System.out.println(tmp);
            }

        } else {
            ch[L] = 1;
            DFS(L +
                    1); // 왼쪽 사용한다
            ch[L] = 0;
            DFS(L + 1); // 오른쪽 사용안한다
        }

    }

    public static void main(String[] args) {
        n = 3;
        ch = new int[n + 1];
        DFS(1);
    }
}
