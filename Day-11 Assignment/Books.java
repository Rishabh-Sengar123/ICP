import java.util.*;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int left = 0, right = 0, sum = 0, maxBooks = 0;

        while (right < n) {
            sum += a[right];
            while (sum > t) {
                sum -= a[left];
                left++;
            }
            maxBooks = Math.max(maxBooks, right - left + 1);
            right++;
        }

        System.out.println(maxBooks);
    }
}
