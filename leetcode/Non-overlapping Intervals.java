class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
      Arrays.sort(intervals, Comparator.comparingDouble(o -> o[1]));
        int n = intervals.length;
     
        int endStart = intervals[0][1];
        int count = 1;

        for (int i = 1 ; i < n  ; i++){
            if(intervals[i][0] >= endStart){
                count ++;
                endStart = intervals[i][1];
            } 

        }

      return  n - count ;
    }
}
