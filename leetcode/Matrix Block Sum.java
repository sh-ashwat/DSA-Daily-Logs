class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {

        int r = mat.length;
        int  c = mat[0].length;
        int result[][] = new int[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int sum = 0;

                for (int m = i - k; m <= i + k; m++) {
                    for (int n = j - k; n <= j + k; n++) {
                        if (m >= 0 && m < r &&  n >= 0 && n < c) {
                            sum += mat[m][n];
                        }
                    }
                }
                result[i][j] = sum;
            }
        }
        return result;
    }
}
