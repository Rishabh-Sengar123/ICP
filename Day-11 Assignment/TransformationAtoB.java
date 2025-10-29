import java.util.*;

public class TransformationAtoB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        List<Long> list = new ArrayList<>();

        while (b > a) {
            list.add(b);
            if (b % 10 == 1) b /= 10;
            else if (b % 2 == 0) b /= 2;
            else break;
        }

        if (b == a) {
            list.add(a);
            Collections.reverse(list);
            System.out.println("YES");
            System.out.println(list.size());
            for (long x : list) System.out.print(x + " ");
        } else {
            System.out.println("NO");
        }
    }
}
