class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int n = 0; n < numRows; n++) {
            result.add(generateRow(n));
        }
        return result;
    }
    private List<Integer> generateRow(int n) {
        List<Integer> row = new ArrayList<>();
        long val = 1;
        row.add((int) val);
        for (int k = 1; k <= n; k++) {
            val = val * (n - k + 1) / k; 
            row.add((int) val);      
        }
        return row;
    }
}