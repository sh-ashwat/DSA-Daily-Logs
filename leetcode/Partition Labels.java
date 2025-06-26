class Solution {
    public List<Integer> partitionLabels(String s) {
       
       

       //find the last Occurence of each s 
       HashMap<Character , Integer> lastIndex = new HashMap<>();

       for ( int i = 0 ; i < s.length(); i++){
        lastIndex.put(s.charAt(i) , i);
       }

       //check for the partition
       List<Integer> partition = new ArrayList<>();
        int start = 0 , end = 0 ;
       for( int i = 0 ; i< s.length() ; i++){
        end = Math.max( end , lastIndex.get(s.charAt(i)));

        if( i == end){
            partition.add( end - start +1);
            start = i +1 ;
        }
       }
       return partition; 
    }
}
