class Solution {
    public boolean check(int k,int h,int[] arr){
       long sum=0;
        for(int i=0;i<arr.length;i++){
            sum+= (int)Math.ceil((double)arr[i]/k);
        }
        return sum<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int max=0;
        int ans=0;
       for(int i=0;i<n;i++) max=Math.max(max,piles[i]);

       int l=1,r=max;
      
       while(l<=r){
        int mid=l+(r-l)/2;
        if(check(mid,h,piles)==false){
            l=mid+1;
        }
        else{
            ans=mid;
            r=mid-1;
        }
       }
return ans;
       
    }
}