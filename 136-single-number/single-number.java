class Solution {
    public int singleNumber(int[] nums) {
   if(nums.length == 1){
            return nums[0];
        }
        HashSet set=new HashSet<>();
        int r=0;
        for(int num:nums){
            if(!set.add(num)){
                r-=num;
            }
            else{
                r+=num;
            }
        }
        return r;
    }
    
}