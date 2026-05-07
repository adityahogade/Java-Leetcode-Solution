class Solution {
    public boolean check(int[] arr,int mid,int k){
         int sum = 0;
        int c = 1;
        for (int i = 0; i < arr.length; i++) {
            if (sum + arr[i] <= mid) {
                sum += arr[i];
            } else {
                c++;
                sum = arr[i];
            }
        }
        return c<=k;
    }
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=0;
        for(int i=0;i<nums.length;i++) {
            sum+=nums[i];
            max=Math.max(max,nums[i]);
        }
        int l=max,r=sum;
        int ans=-1;
        int u=0;
        while(l<=r && u==0){
            int mid=l+(r-l)/2;
            if(check(nums,mid,k)){
                
                if(check(nums,mid-1,k)==false) {
                    u=1;
                    ans=mid;
                }
                else r=mid-1;
                ans=mid;
            }
            else l=mid+1;
        }
       return ans; 
    }
}