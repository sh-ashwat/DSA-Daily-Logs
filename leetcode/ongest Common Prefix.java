class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        StringBuilder result = new StringBuilder();
        
        int n = strs.length;
        int minLen = Integer.MAX_VALUE;
        
        // First find the minimum length string
        for (int i = 0; i < n; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        
        // Now compare characters vertically
        for (int i = 0; i < minLen; i++) {
            char currChar = strs[0].charAt(i);
            
            for (int j = 1; j < n; j++) {
                if (strs[j].charAt(i) != currChar) {
                    return result.toString();
                }
            }
            
            result.append(currChar);
        }
        
        return result.toString();
    }
}
