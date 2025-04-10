class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];

        for (int i = 0; i < arr1.length; i++) {
            int num = arr1[i];
            count[num]++;
        }

        int index = 0;

        for (int j = 0; j < arr2.length; j++) {
            int num = arr2[j];
            while (count[num] > 0) {
                arr1[index++] = num;
                count[num]--;
            }
        }
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr1[index++] = i;
                count[i]--;
            }
        }
        return arr1;
    }
}
