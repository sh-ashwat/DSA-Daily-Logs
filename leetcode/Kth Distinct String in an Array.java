class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int freq = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i].equals(arr[j])) {
                    freq++;
                }
            }

            if (freq == 1) {
                count++;

                if (count == k) {
                    return arr[i];
                }
            }
        }
        return "";
    }
}
