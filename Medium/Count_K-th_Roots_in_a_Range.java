class Solution {
    long pow(long a,int k){
        long ans=1;
        
        for(int i=0;i<k;i++){
            if(a!=0 && ans>Long.MAX_VALUE/a) return Long.MAX_VALUE;
            ans*=a;
        }
        return ans;
    }
    public int countKthRoots(int l, int r, int k) {
       long left = firstRoot(l,k);
       long right = lastRoot(r,k);

        return (int) Math.max(0,right-left+1);
        
    }

    long firstRoot(long l,int k){
        long low=0,high=l;
        long ans=l;
        while(low<=high){
            long mid=low+(high-low)/2;

            if(pow(mid,k)>=l){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    long lastRoot(long r,int k){
        long low=0,high=r;
        long ans=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(pow(mid,k)<=r){
                ans=mid;
                low=mid+1;
            }
            else    high=mid-1;
            
        }
        return ans;
    }
}