class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int suf_min[]=new int[n];
        suf_min[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suf_min[i]=Math.min(suf_min[i+1],nums[i]);
        }

        int max_val=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            max_val=Math.max(max_val,nums[i]);
            if(max_val-suf_min[i] <=k)return i;
        }
        return -1;
    }
}