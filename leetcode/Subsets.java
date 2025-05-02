class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length ;

        List<List<Integer>>  result = new ArrayList<>();
        result.add( new ArrayList<Integer>());

        for ( int i = 0 ; i< n ; i++){
                int size = result.size();
                for( int j = 0 ; j< size ; j++){
                    List<Integer> subset = new ArrayList<Integer>(result.get(j));
                    subset.add(nums[i]);
                    result.add(subset);
                }
        }
        return result;
    }
}
