class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=(k%n+n)%n; 
         rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
    public void rev(int []nums,int l,int r){
        while(l<r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
    }
}