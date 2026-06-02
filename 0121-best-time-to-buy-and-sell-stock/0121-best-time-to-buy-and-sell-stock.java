class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int mp=0;
        for(int p:prices){
            if(p<min){
                min=p;
            }
            else{
                mp=Math.max(mp,p-min);
            }
        }
        return mp;
    }
}