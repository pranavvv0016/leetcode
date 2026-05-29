class Solution {
    public int sumOfUnique(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
       HashSet<Integer> duplicates = new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
                 duplicates.add(num);
            }
            else{
                set.add(num);
            }
        }
        set.removeAll(duplicates); 
        int [] res=new int [set.size()];
        int i=0;
        int ts=0;
        for(int num:set){
            res[i++]=num;
        }
        for(int num:res){
            ts+=num;
        }
        return ts;
    }
}