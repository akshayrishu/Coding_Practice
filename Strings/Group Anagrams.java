import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mp = new HashMap<>();

        for (String word : strs) {

            char[] arr = word.toCharArray();

            Arrays.sort(arr);

            String k = new String(arr);

            mp.putIfAbsent(k, new ArrayList<>());

            mp.get(k).add(word);
        }

        return new ArrayList<>(mp.values());
    }
    public static void main(String[] args) {
        Solution obj = new Solution();
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = obj.groupAnagrams(strs);
        System.out.println(result);
    }
}
