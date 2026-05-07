class Solution {
    public boolean check(int[] arr,int mid,int days){
        int sum=0;
        int c=1;
        for(int i=0;i<arr.length;i++){
            if(sum+arr[i] <= mid) sum+=arr[i];
            else {
                c++;
                sum=arr[i];
            }
        }
        return c<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=0;
        for(int i=0;i<weights.length;i++){
            sum+=weights[i];
             max=Math.max(max,weights[i]);
        }
        int l=max,r=sum;
        int ans=-1;
        int u=0;
        while(l<=r && u==0){
            int mid=l+(r-l)/2;
            if(check(weights,mid,days)){
                if(check(weights,mid-1,days)==false){
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