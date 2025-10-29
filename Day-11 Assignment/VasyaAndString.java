import java.util.*;

public class VasyaAndString {
    static int maxBeauty(String s, int k, char target) {
        int left = 0, maxLen = 0, changes = 0;
        for (int right = 0; right < s.length(); right++) {
            if (s.charAt(right) != target) changes++;
            while (changes > k) {
                if (s.charAt(left) != target) changes--;
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();

        int result = Math.max(maxBeauty(s, k, 'a'), maxBeauty(s, k, 'b'));
        System.out.println(result);
    }
}

