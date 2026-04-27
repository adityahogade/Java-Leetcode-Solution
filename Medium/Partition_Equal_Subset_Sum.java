class 416_Partition_Equal_Subset_Sum {
    public boolean canPartition(int[] nums) {
        int total=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            total+=nums[i];
        }
        if(total%2!=0) return false;
        int target=total/2;
        boolean[] dp=new boolean[target+1];
        dp[0]=true;
        for(int num:nums){
            for(int j=target;j>=num;j--){
                dp[j]=dp[j] || dp[j-num];
            }
        }

        return dp[target];
    }
}