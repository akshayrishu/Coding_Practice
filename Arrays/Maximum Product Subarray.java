
class Solution {

    public int maxProduct(int[] nums) {
        int maxi = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = i; j < nums.length; j++) {
                product *= nums[j];

                maxi = Math.max(maxi, product);
            }
        }

        return maxi;
    }

    public static void main(String[] args) {

        Solution obj = new Solution();

        int[] nums = {2, 3, -2, 4};

        int result = obj.maxProduct(nums);

        System.out.println("Maximum Product: " + result);
    }
}
