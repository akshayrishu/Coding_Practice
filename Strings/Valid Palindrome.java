
class Solution {

    public boolean isPalindrome(String s) {

        String str = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int i = 0;
        int j = str.length() - 1;

        while (i < j) {

            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        String s = "A man, a plan, a canal: Panama";

        boolean result = obj.isPalindrome(s);

        System.out.println(result);
    }
}
