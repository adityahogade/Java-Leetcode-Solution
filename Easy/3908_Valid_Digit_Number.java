class Solution {
    public boolean validDigit(int n, int x) {
        int c=0;
        if(n==x) return false;
        while(n!=0){
            int val=n%10;
            n/=10;
           
            if(val==x) c++;
            if(n==0 && x==val ) return false;
        }
        return c>0;
    }
}