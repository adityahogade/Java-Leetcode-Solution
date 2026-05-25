class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        
        int total=(n*(n+1))/2;
        
        int ans=-1;
        int l=1,r=n;
        while(l<=r){
            int mid=l+(r-l)/2;
            int sum=(mid*(mid+1))/2;
            if(sum==((total+mid)-(sum))) return mid;
            else if(sum>((total+mid)-(sum))) r=mid-1;
            else l=mid+1;
        }
        
        return -1;
    }
}