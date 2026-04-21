class Solution {
    public long maximumTripletValue(int[] nums) {
        int n=nums.length;
        
        long  ans=0;
        for(int j=n-2;j>0;j--){
            long diff=0;
            for(int i=0;i<j;i++){
                diff=Math.max(diff,nums[i]-nums[j]);
            }
            for(int k=j+1;k<n;k++){
                ans=Math.max(ans,diff*nums[k]);
            }
        }
        
        return ans;
        
    }
}