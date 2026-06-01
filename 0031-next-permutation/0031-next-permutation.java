class Solution {
    public void nextPermutation(int[] nums) {
        int bp=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                bp=i;
                break;
            }
        }
        if(bp==-1){
            rev(nums,0,n-1);
            return ;
        }
        for(int i=n-1;i>bp;i--){
            if(nums[bp]<nums[i]){
                int t=nums[bp];
                nums[bp]=nums[i];
                nums[i]=t;
                break;
            }
        }
        rev(nums,bp+1,n-1);
    }
    public void rev(int [] nums,int l,int r){
        while(l<r){
            int t=nums[l];
            nums[l]=nums[r];
            nums[r]=t;
            l++;
            r--;
        }
    }
}