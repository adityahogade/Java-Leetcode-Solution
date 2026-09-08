class Solution {
    public int countCommas(int n) {
        int ans=0;
        long i=999;
        int j=1;
        long n1=999999;

        while(n>i){
            if(n>n1){
                ans+= (j*(n1-i));
            }
            else{
                ans+=(j*(n-i));
            }
            i=n1;
            n1=(n1*1000)+999;
            j++;
        }
        

        
return ans;        
    }
}