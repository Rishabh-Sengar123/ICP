import java.util.*;

public class DreamoonWifi {
    static double probability(int target, int current, int unknown) {
        if (unknown == 0) return target == current ? 1.0 : 0.0;
        return 0.5 * probability(target, current + 1, unknown - 1) +
               0.5 * probability(target, current - 1, unknown - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int target = 0, current = 0, unknown = 0;

        for (char c : s1.toCharArray()) target += (c == '+') ? 1 : -1;
        for (char c : s2.toCharArray()) {
            if (c == '+') current++;
            else if (c == '-') current--;
            else unknown++;
        }

        double ans = probability(target, current, unknown);
        System.out.printf("%.12f\n", ans);
    }
}
