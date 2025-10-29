import java.util.*;

public class NastyaAndRice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int minTotal = n * (a - b);
            int maxTotal = n * (a + b);
            int minPossible = c - d;
            int maxPossible = c + d;
            if (maxTotal < minPossible || minTotal > maxPossible) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
        sc.close();
    }
}
