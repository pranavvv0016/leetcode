class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        //int res=new int[2];
        int n=grid.length;
        int dup=-1;
        int mis=-1;
        HashSet set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<grid[i].length;j++){
                if(!set.add(grid[i][j])){
                    dup=grid[i][j];
                }
                set.add(grid[i][j]);
            }
        }
        for(int i=1;i<=n*n;i++){
            if(!set.contains(i)){
                mis=i;
                break;
            }
        }
        return new int[]{ dup, mis};
    }
}