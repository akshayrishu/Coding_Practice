
import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            max = Math.max(max, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        Solution obj = new Solution();

        System.out.println(obj.maxSubArray(nums));

        sc.close();
    }
}
