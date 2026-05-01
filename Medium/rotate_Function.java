class Solution {
    public int maxRotateFunction(int[] nums) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<n;i++) sum+=nums[i];

        int ans=0;
        for(int i=0;i<n;i++)            ans+=(i*nums[i]);
        int prev=ans;
        for(int i=n-1;i>=0;i--){
            int val=(prev+sum)-nums[i]-((n-1)*nums[i]);
            ans=Math.max(ans,val);
            prev=val;
        }

        return ans;
    }
}