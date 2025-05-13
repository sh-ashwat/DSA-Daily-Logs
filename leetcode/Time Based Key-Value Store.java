class TimeMap {
private Map<String , TreeMap<Integer , String>> map ; 
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
     if(map.containsKey(key)){
          map.get(key).put(timestamp, value);
     }  else {
       TreeMap<Integer, String> treeMap = new TreeMap<>();
            treeMap.put(timestamp, value);
            map.put(key, treeMap);
     }  
    }
    
    public String get(String key, int timestamp) {
        TreeMap<Integer , String > treeMap = map.get(key);
        if(treeMap == null ) {
            return "";
        }
        Map.Entry<Integer , String> entry = treeMap.floorEntry(timestamp);

        return entry == null ? "" : entry.getValue();
    }
}
