import java.util.*;

public class RecursiveQueries {
    static final int N = 1000001;
    static int[] a = new int[N];
    static int[][] b = new int[10][N];

    public static void main(String[] args) {
        for (int i = 1; i < N; i++) {
            if (i < 10) a[i] = i;
            else {
                int j = i, k = 1;
                while (j > 0) {
                    int d = j % 10;
                    if (d != 0) k *= d;
                    j /= 10;
                }
                a[i] = a[k];
            }
        }

        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < N; j++) {
                b[i][j] = b[i][j - 1] + (a[j] == i ? 1 : 0);
            }
        }

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            sb.append(b[k][r] - b[k][l - 1]).append("\n");
        }

        System.out.print(sb);
        sc.close();
    }
}
