
class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int maxi = 0;

        while (i < j) {
            int wid = j - i;
            int hei = Math.min(height[i], height[j]);
            int area = wid * hei;

            maxi = Math.max(maxi, area);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = obj.maxArea(height);

        System.out.println("Maximum Area: " + result);
    }
}
