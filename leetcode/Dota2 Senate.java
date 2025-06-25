class Solution {
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> qr = new LinkedList<>();
        Queue<Integer> qd = new LinkedList<>();

        for( int i = 0 ; i < senate.length() ; i++){
            char ch = senate.charAt(i);
            if( ch == 'R'){
                qr.add(i);
            } else {
                qd.add(i);
            }
        }
        while ( !qr.isEmpty() && !qd.isEmpty()){
            int rIdx = qr.poll();
            int dIdx = qd.poll();

            if( rIdx < dIdx){
                qr.add(rIdx + n);
            } else {
                qd.add(dIdx + n);
            }
        }
        String winner = qr.isEmpty () ? "D" : "R";
        if( winner == "R"){
            return "Radiant";
        } else {
            return "Dire";
        }
    }
}
