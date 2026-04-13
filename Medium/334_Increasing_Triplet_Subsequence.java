class 334_Increasing_Triplet_Subsequence {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int p_min=nums[0];
        int[] s_max=new int[n];
        
        
        s_max[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            s_max[i]= Math.max(s_max[i+1],nums[i]);
        } 

        for(int i=1;i<n-1;i++){
            if(p_min<nums[i] && nums[i]<s_max[i+1]) return true;
            p_min= Math.min(p_min,nums[i]);
        }
        return false;
    }
}