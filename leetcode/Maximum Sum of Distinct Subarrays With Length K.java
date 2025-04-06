class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length ;
        long ans = 0 ;
        long cs = 0;
        int start = 0 ; 
        int end = 0;

        HashMap<Integer , Integer> lastseen = new HashMap<>();

        while ( end  < n ){
            int curr = nums[end];
            int j = lastseen.getOrDefault(curr , -1);

            while (j >= start || (end - start + 1) > k)
            {
                
                cs -= nums[start++];
            }
            cs += nums[end];
            lastseen.put(curr, end);

            if((end - start +1) == k){
                ans = Math.max(ans, cs);
            }
            end++;
        }
        return ans ;
    }
}
