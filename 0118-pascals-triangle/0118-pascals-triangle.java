class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<numRows;i++) {
            result.add(generateRow(i));
        }
        return result;
    }
    private List<Integer> generateRow(int i) {
        List<Integer> row = new ArrayList<>();
        long val = 1;
        row.add((int) val);
        for (int k = 1; k <= i; k++) {
            val = val * (i - k + 1) / k; 
            row.add((int) val);      
        }
        return row;
    }
}