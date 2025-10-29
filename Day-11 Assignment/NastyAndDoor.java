import java.util.Scanner;

public class NastyAndDoor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int[] peaks = new int[n];
            for (int i = 1; i < n - 1; i++) {
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    peaks[i] = 1;
                }
            }

            int[] prefix = new int[n];
            prefix[0] = peaks[0];
            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1] + peaks[i];
            }

            int maxPeaks = -1;
            int bestL = 0;

            for (int l = 0; l + k - 1 < n; l++) {
                int r = l + k - 1;
                int count = prefix[r - 1] - prefix[l];  // exclude boundaries
                if (count > maxPeaks) {
                    maxPeaks = count;
                    bestL = l;
                }
            }

            System.out.println((maxPeaks + 1) + " " + (bestL + 1));
        }

        sc.close();
    }
}
