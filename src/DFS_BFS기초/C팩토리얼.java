package DFS_BFS기초;

public class C팩토리얼 {
    static int DFS(int n ){
        int answer =0;

        if(n == 1 ) return 1;
        else {
           answer = n* DFS(n-1);
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(DFS(5));
    }
}
