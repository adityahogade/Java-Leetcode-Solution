class Solution {
    public boolean check(int[] arr,int mid){
        int n=arr.length;
        long[] newArr=new long[n];
        for(int i=0;i<n;i++) newArr[i]=arr[i];
        for(int i=n-1;i>=1;i--){
            if(newArr[i]>mid){
                newArr[i-1]=arr[i-1]+(newArr[i]-mid);


            }
        }

        return newArr[0]<=mid;
    }
    public int minimizeArrayValue(int[] nums) {
        int  max=0;
        for(int i=0;i<nums.length;i++) max=Math.max(max,nums[i]);

        int l=nums[0] ,r=max;
        int ans=r;
        if(l==r) return l;
       
    

        while(l <= r) {

            int mid = l + (r - l) / 2;

            if(check(nums, mid)) {
                ans = mid;
                r = mid - 1;
            }
            else {
                l = mid + 1;
            }
        }
 return ans;       
    }
}