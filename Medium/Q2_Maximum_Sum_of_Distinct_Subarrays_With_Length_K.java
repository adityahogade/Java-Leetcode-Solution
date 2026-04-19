class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum=0;
        
        int n=nums.length;
        long maxSum=0;
        long currentSum=0;
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        int j=0;
        for(int i=0;i<n;i++){
            while(hm.containsKey(nums[i])){
                hm.remove(nums[j]);
                currentSum-=nums[j];
                j++;
            }

            hm.put(nums[i],i);
            currentSum+=nums[i];
            if(i-j+1>k){
                hm.remove(nums[j]);
                currentSum-=nums[j];
                j++;
            }
            if(i-j+1 == k){
                maxSum=Math.max(maxSum,currentSum);
            }
            
        }
        return maxSum;
    }
}