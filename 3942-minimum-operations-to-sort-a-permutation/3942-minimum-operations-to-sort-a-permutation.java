class Solution {
    public int minOperations(int[] nums) {
int n=nums.length;        
       int ans=-1;
       int inc_count=0;
       int dec_count=0;
       int min_ind=0;
       for(int i=1;i<n;i++){
        if(nums[i]==(nums[i-1]+1)%n) inc_count++;
        else if(nums[i-1]== (nums[i]+1)%n )dec_count++;
        else return -1;
        if(nums[i]==0) min_ind=i;
       }

       if(inc_count==n-1){
        ans=Math.min(min_ind,2+(n-min_ind));
       }
       else if(dec_count==n-1){
        ans=Math.min(2+min_ind,1+(n-1)-min_ind);
       }
        return ans; 
    }
}