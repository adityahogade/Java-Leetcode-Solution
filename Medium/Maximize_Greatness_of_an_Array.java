class Solution {
    boolean check(int mid,int[] arr){
        int i=mid-1;
        int j=arr.length-1;
        while(i>=0){
            if(arr[i]>=arr[j]) return false;
            i--;
            j--;
        }
        return true;
    }
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(nums[0]==nums[n-1]) return 0;
        int l=0,r=n;
        int ans=0;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(check(mid,nums)){
                ans=mid;
                l=mid+1;
            }
            else r=mid-1;
        }
        return ans;
    }
}