class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int row = matrix.length;
        int col = matrix[0].length;

        int left = 0 , right = col-1 , bottom = row -1 , top = 0 ;

        while ( top <= bottom && left <= right)
        {
        //top
         for (int j = left ; j <= right ; j++)
         {
            ans.add(matrix[top][j]);
            
         }
         top++;
        //right
        for ( int i = top; i<= bottom ; i++) 
        {
            ans.add(matrix[i][right]);
           
        }
         right --;

        //bottom
        if ( top <= bottom) 
        {
            for ( int j = right ; j>= left; j--)
            {
                ans.add(matrix[bottom][j]);
                
            }
            bottom--;
        }

        //left 
        if( left <= right) 
        {
            for ( int i = bottom ; i >= top ; i--)
            {
                ans.add(matrix[i][left]);
               
            }
             left++;
        }
         }
         return ans;

    }
}
