class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int r[] = new int[m + n];

        // use m and n, NOT length
        for (int i = 0; i < m; i++) {
            r[i] = nums1[i];        // ✅ no if condition needed
        }
        for (int i = 0; i < n; i++) {
            r[i + m] = nums2[i];    // ✅ offset by m
        }
        arr(r);
        for (int i = 0; i < m + n; i++) {
            nums1[i] = r[i];
        }
    }
    public void arr(int[] r) {
        int len = r.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (r[j] > r[j + 1]) {
                    int temp = r[j];
                    r[j]     = r[j + 1];
                    r[j + 1] = temp;
                }
            }
        }
    }
}