class Solution {
    public int findMin(int[] nums) {
        int s=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<s){
                s=nums[i];
            }
        }
        return s;
    }
}