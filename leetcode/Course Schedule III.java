class Solution {
    public int scheduleCourse(int[][] courses) {
        

        //sort 
        Arrays.sort(courses , Comparator.comparingDouble(o -> o[1]));
        

        PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());
        int time = 0 ;
        for( int i = 0 ; i < courses.length ; i++){
            
            int duration = courses[i][0];
            int lastDay= courses[i][1];

            
            time +=duration;
            queue.add(duration);
            
            if( time > lastDay ){
                time -= queue.poll();

            }
          
        }
        return queue.size();
    }
}
