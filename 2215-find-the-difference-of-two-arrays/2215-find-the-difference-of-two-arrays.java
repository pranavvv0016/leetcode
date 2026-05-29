class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set1=new HashSet<>();
        HashSet<Integer>set2=new HashSet<>();
        for(int num:nums1) set1.add(num);
        for(int num:nums2) set2.add(num);
        ArrayList<Integer>res1=new ArrayList<>(set1);
        res1.removeAll(set2);
        ArrayList<Integer>res2=new ArrayList<>(set2);
        res2.removeAll(set1);
        return Arrays.asList(res1,res2);
    }
}