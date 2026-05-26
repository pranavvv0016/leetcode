class Solution {
    public int singleNonDuplicate(int[] nums) {
   HashSet<Integer>set=new HashSet<>();
   for(int num:nums){
    if(set.contains(num)){
        set.remove(num);
    }
    else{
        set.add(num);
    }
   }
   int [] r=new int[set.size()];
   int i=0;
   for(int num:set){
    r[i++]=num;
   }
    return r[0];
    }
}