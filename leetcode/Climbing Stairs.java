class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            memo[i] = -1;
        }
        return climb(n, memo);
    }

    private int climb(int n, int[] memo) {
        if (n <= 2) {
            return n;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        memo[n] = climb(n - 1, memo) + climb(n - 2, memo);
        return memo[n];
    }
}
