class Solution {
    public boolean wordPattern(String pattern, String s) {
        char [] a = pattern.toCharArray();
        String[] b = s.split(" ");
        if(a.length != b.length){
            return false;
        }
        HashMap<Character,String> hm = new HashMap<>();
        ArrayList<String> al = new ArrayList<>();
        boolean f= true;
        for(int i=0;i<a.length; i++){
            if(!(hm.containsKey(a[i]))){
                hm.put(a[i],b[i]);
                if(!(al.contains(b[i]))){
                    al.add(b[i]);
                }
                else{
                    return false;
                }
            }
            else{
                if(!(b[i].equals(hm.get(a[i])))){
                    return false;
                }
            }
        }
        return f;
    }
}
