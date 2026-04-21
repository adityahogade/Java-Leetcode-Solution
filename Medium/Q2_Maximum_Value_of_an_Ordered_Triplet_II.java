class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        int[] p=new int[n];
        p[0]=0;
        int max=nums[0];
        for(int i=1;i<n;i++){
            int diff=max-nums[i];
            p[i]=Math.max(p[i-1],diff);
            max=Math.max(max,nums[i]);
            
        }
        long ans=0;
        for(int k=2;k<n;k++){
            ans=Math.max(ans,(long)nums[k] * (long)p[k-1]);
        }
        return ans;
    }
}