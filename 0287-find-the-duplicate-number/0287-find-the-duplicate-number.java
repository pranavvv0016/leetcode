class Solution {
    public int findDuplicate(int[] nums) {
        int dup=-1;
        HashSet set=new HashSet<>();
        for(int num:nums){
            if(!set.add(num)){
                dup=num;
            }
        }
        return dup;
    }
}