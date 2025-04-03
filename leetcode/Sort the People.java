class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        //To track the names and height 
        HashMap <Integer, String > map = new HashMap<>();

        for (int i = 0 ; i< names.length ; i++) 
        {
            map.put(heights[i], names[i]);
        }

        // height ko sort karna hai 
        Arrays.sort(heights);
        String[] sortedNames = new String[names.length];
        int index = 0;
        for ( int i = names.length - 1; i>=0; i--)
        {
            sortedNames[index]  = map.get(heights[i]);
            index++;
        }
        return sortedNames;
    
    }
}
