class Solution {
    public int maxFrequencyElements(int[] nums) {
       
        int n = nums.length ;
        int max = 0;
        int sum = 0 ;
        HashMap<Integer, Integer > map = new HashMap<>();

        for( int i = 0 ; i< n ; i++){
            map.put(nums[i] , map.getOrDefault(nums[i], 0 )+1);

        }
        for( int freq : map.values()){
             max = Math.max(max , freq );
             
        }

        for( int  freq : map.values()){
            if( freq == max ){
                sum += max;
            }
        }

        return sum;
    }
}
