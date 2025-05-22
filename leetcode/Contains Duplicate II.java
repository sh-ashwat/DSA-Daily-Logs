class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

       HashMap<Integer , Integer> numbers = new HashMap<>();
    
    for( int i = 0; i<nums.length; i++){
        if(numbers.containsKey(nums[i])){
            int idx= numbers.get(nums[i]);

            if((i-idx) <= k)
            return true;
            else
            numbers.put(nums[i] , i);
        }
        else
        numbers.put(nums[i], i);
    }
        return false;
    }
}
