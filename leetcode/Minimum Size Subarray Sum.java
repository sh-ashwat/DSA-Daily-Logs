class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen  = Integer.MAX_VALUE;
        int i =0 ;
        int currSum = 0;
        int n = nums.length;

        for(int j = 0; j< n ; j++){
            currSum += nums[j];

            while ( currSum >= target){
                if( (j-i+1) < minLen){
                    minLen =  j-i+1;
                }
                currSum -= nums[i];
                i++;
            }
        }
       return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }
}
