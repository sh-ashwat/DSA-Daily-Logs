class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int jobs[][] = new int [n][3];

        for( int i = 0 ; i<n ; i++){
            jobs[i][0] = startTime[i];
            jobs[i][1] = endTime[i];
            jobs[i][2] = profit[i];
        }
        Arrays.sort(jobs , Comparator.comparingDouble(o -> o[1]));

        int dp[] = new int[n];
        dp[0] = jobs[0][2];

        for( int i = 1 ; i< n ; i++){
            int includeProfit = jobs[i][2];

            int l = binarySearch(jobs, i);

            if ( l !=  -1){
                includeProfit += dp[l];
            }
            dp[i] = Math.max(dp[i - 1], includeProfit);
        } 

       return dp[ n- 1];
        }
        

    private int binarySearch(int[][] jobs , int i){
        int low = 0 , high = i-1 ;
        while (  low <= high) {
            int mid = (low + high) / 2;
            if ( jobs[mid][1] <= jobs[i][0]) {
                if(mid == i-1 || jobs[mid + 1][1] > jobs[i][0]) {
                    return mid;
                }
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }
}
