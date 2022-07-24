package DFS_BFS기초;

public class D피보나치재귀 {

    static int[] fibo;

    public static int DFS(int n) {
        if(fibo[n] > 0) return fibo[n];

        if (n == 1) return fibo[n] = 1;
        else if (n == 2) return fibo[n] = 1;
        else return fibo[n] = DFS(n - 2) + DFS(n - 1);
    }

    public static void main(String[] args) {
        int n = 45;

        fibo = new int[n + 1]; // 첫번째항이 1 //  0 , 1 , 1 , 2 ...
        DFS(n);

        for (int i = 1; i <= n; i++) {
            System.out.println(fibo[i] + " ");
        }
    }
}
