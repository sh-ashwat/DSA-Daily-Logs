class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
      Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

      int boxes = 0 ;

      for(int[] box : boxTypes) {
        int noOfBoxes = box[0];
        int noOfUnits = box[1];

        if(truckSize >= box[0]) {
            boxes += noOfBoxes * noOfUnits;
            truckSize -= noOfBoxes;
        } else {
            boxes += truckSize * noOfUnits;
            break;
        }
      }  
      return boxes;
    }
}
