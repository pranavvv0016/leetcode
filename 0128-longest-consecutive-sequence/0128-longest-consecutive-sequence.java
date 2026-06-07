class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hm = new HashSet<>();
        int m = 0;

        for (int i = 0; i < nums.length; i++) {
            hm.add(nums[i]);
        }

        for (int num : hm) {
            if (!hm.contains(num - 1)) {
                int s = num;
                int c = 1;

                while (s != Integer.MAX_VALUE && hm.contains(s + 1)) {
                    s++;
                    c++;
                }

                if (c > m) {
                    m = c;
                }
            }
        }

        return m;
    }
}