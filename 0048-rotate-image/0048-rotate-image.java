class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int t=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=t;
            }
        }
        for(int i=0;i<matrix.length;i++){
                rev(matrix[i]);
            }
    }
    public void rev(int matrix[]){
        int l=0;
        int r=matrix.length-1;
        while(l<r){
           int t=matrix[l];
            matrix[l]=matrix[r];
            matrix[r]=t;
            l++;
            r--;
        }
    }
}