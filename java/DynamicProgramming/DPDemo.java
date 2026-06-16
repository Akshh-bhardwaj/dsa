package DynamicProgramming;

public class DPDemo {

    /**
     * 1. 0/1 Knapsack Problem with O(W) Space Optimization.
     * Time Complexity: O(N*W), Space Complexity: O(W)
     */
    public static int knapsack01(int[] wt, int[] val, int W) {
        int[] dp = new int[W + 1];
        
        for (int i = 0; i < wt.length; i++) {
            // Traverse backward to avoid using the same item multiple times
            for (int w = W; w >= wt[i]; w--) {
                dp[w] = Math.max(dp[w], val[i] + dp[w - wt[i]]);
            }
        }
        return dp[W];
    }

    /**
     * 2. Longest Common Subsequence (LCS) using Tabulation.
     * Time Complexity: O(M*N), Space Complexity: O(M*N)
     */
    public static int lcs(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    /**
     * 3. Coin Change Problem - Find minimum coins to make change for amount.
     * Time Complexity: O(N*amount), Space Complexity: O(amount)
     */
    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        java.util.Arrays.fill(dp, amount + 1); // fill with sentinel value
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i - coin >= 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        System.out.println("--- 1. 0/1 Knapsack ---");
        int[] wt = {1, 3, 4, 5};
        int[] val = {1, 4, 5, 7};
        int W = 7;
        System.out.println("Max Value (Capacity=" + W + "): " + knapsack01(wt, val, W)); // 9 (weights 3+4=7, values 4+5=9)

        System.out.println("\n--- 2. Longest Common Subsequence (LCS) ---");
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println("LCS of \"" + s1 + "\" and \"" + s2 + "\": " + lcs(s1, s2)); // 3 ("ace")

        System.out.println("\n--- 3. Coin Change ---");
        int[] coins = {1, 2, 5};
        int amount = 11;
        System.out.println("Min coins for amount " + amount + ": " + coinChange(coins, amount)); // 3 (5+5+1)
    }
}
