class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);

        int j=cost.length-1;
        int i=0;
        int ans=0;
        while(j>=0){
            ans+=cost[j];
            j--;
            if(j>=0){
            ans+=cost[j];
            j--;
            j--;
            }
        }
        return ans;
    }
}