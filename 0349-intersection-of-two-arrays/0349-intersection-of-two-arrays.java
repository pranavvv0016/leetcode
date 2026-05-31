import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        if(nums1.length==0||nums2.length==0){
            return new int[0];
        }
        HashSet<Integer>set=new HashSet<>();
        TreeSet<Integer>rset=new TreeSet<>();
        for(int num:nums1){
            set.add(num);
        }
        for(int num:nums2){
            if(set.contains(num)){
                rset.add(num);
            }
        }
        int r[]=new int[rset.size()];
        int i=0;
        for(int num:rset){
            r[i++]=num;
        }
        return r;
    }
}