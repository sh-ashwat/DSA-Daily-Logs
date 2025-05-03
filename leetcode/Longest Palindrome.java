class Solution {
    public int longestPalindrome(String s) {
        HashSet <Character> set = new HashSet<>();
        int result = 0;

        
            for( int i = 0; i< s.length() ; i++){
                char ch = s.charAt(i);
            
            if(set.contains(ch)){
                result+=2;
                set.remove(ch);
            } else {
                set.add(ch);
            }
        }
        if(set.size() > 0){
            result+=1;
        }
        return result;
    }
}
