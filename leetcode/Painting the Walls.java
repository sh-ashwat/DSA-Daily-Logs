class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;

        int minCost[] = new int[n+1];

        Arrays.fill(minCost , Integer.MAX_VALUE);

        minCost[0] = 0 ;
        for( int i = 0 ; i< n ; i++){
            for( int j = n ; j>0 ; j--){
                int prev = Math.max(j - time[i] - 1, 0);
                if (minCost[prev] != Integer.MAX_VALUE) {
                    minCost[j] = Math.min(minCost[j], minCost[prev] + cost[i]);
                }
            }
        }
        return minCost[n];
    }
}
