import java.util.*;
class Find_All_Anagrams_in_String
 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) return result;

        int[] countP = new int[26];
        int[] countS = new int[26];

        for (char c : p.toCharArray()) {
            countP[c - 'a']++;
        }

        int window = p.length();

        for (int i = 0; i < s.length(); i++) {
            countS[s.charAt(i) - 'a']++;

            if (i >= window) {
                countS[s.charAt(i - window) - 'a']--;
            }

            if (Arrays.equals(countP, countS)) {
                result.add(i - window + 1);
            }
        }

        return result;
    }
}
