class Solution {
    static int findlast(int nums[], int target) {
        int n = nums.length;
          int start = 0 , end = n -1;
         int index = -1;
         while ( start <= end ) 
         {
             int mid = start + (end - start) / 2;

            if ( nums[mid] == target) 
            {
                index = mid;
                start = mid +1;
            } else if ( nums[mid] > target)
            {
                 end = mid -1;
            }
            else 
            {
               start = mid +1;
            }
         }
         return index;
    }

    static int findFirst(int nums[] , int target) 
    {
     int n = nums.length;
     int start = 0, end = n-1;   

     int index = -1;
     while (start <= end ) {
       int mid = start + (end - start) / 2;
        if (nums[mid] == target)
        {
            index = mid;
            end = mid-1;
        } else if ( nums[mid] < target)
        {
            start = mid +1;
        }
        else {
            end  = mid-1;
        }
     }
     return index;
    }
    public int[] searchRange(int[] nums, int target) {
        
      int first = findFirst(nums, target);
        int last = findlast(nums, target);
        return new int[]{first, last};
    }
}
