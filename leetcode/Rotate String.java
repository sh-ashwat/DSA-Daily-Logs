class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        int n = s.length();

        for (int i = 0; i < n; i++) {

            //Rotate the substring with i postion 

            String rotated = s.substring(i) + s.substring(0, i);
            if (rotated.equals(goal)) {
                return true;
            }
        }
        return false;
    }
}
