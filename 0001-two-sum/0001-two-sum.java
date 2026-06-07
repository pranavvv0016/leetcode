class Solution {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < arr.length; j++) {
            int complement = target - arr[j];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), j};
            }
            map.put(arr[j], j);
        }
        return new int[]{};
    }
}