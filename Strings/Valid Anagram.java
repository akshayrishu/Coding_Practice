import java.util.*;

class Solution {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            m1.put(ch1, m1.getOrDefault(ch1, 0) + 1);
            m2.put(ch2, m2.getOrDefault(ch2, 0) + 1);
        }

        return m1.equals(m2);
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "anagram";
        String t = "nagaram";

        boolean result = obj.isAnagram(s, t);

        System.out.println(result);
    }
}
