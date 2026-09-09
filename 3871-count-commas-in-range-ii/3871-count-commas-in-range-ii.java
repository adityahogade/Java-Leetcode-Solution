class Solution {
    public long countCommas(long n) {
        long ans=0;
        long i=999;
        long n1=999999;
        long j=1;
        while(n>i){
            if(n>n1){
                ans+=(j*(n1-i));
            }
            else{
                ans+= (j*(n-i));
            }
            i=n1;
            n1=(n1*1000)+999;
            j++;
        }
        return ans;
    }
}