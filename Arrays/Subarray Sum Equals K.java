import java.util.*;
class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {1, 1, 1, 2, 1};
        int k = 2;

        int result = obj.subarraySum(nums, k);

        System.out.println("Count: " + result);
    }
}
