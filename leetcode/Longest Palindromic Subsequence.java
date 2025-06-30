
class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        String s1 = new StringBuilder(s).reverse().toString();

        int[][] dp = new int[n + 1][n + 1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return lps(s, s1, 0, 0, dp);
    }

    static int lps(String s, String s1, int i, int j, int[][] dp) {
        if (i == s.length() || j == s1.length()) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        if (s.charAt(i) == s1.charAt(j)) {
            return dp[i][j] = 1 + lps(s, s1, i + 1, j + 1, dp);
        } else {
            return dp[i][j] = Math.max(
                lps(s, s1, i + 1, j, dp),
                lps(s, s1, i, j + 1, dp)
            );
        }
    }
}
