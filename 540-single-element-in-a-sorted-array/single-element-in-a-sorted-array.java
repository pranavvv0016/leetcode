class Solution {
    public int singleNonDuplicate(int[] nums) {
     int r=0;
     for(int num:nums){
        r^=num;
     }
     return r;
    }
}