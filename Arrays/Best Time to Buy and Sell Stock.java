
import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int mini = prices[0];
        int profit = 0;

        for (int price : prices) {
            profit = Math.max(profit, price - mini);
            mini = Math.min(mini, price);
        }

        return profit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        Solution obj = new Solution();

        System.out.println(obj.maxProfit(prices));

        sc.close();
    }
}
