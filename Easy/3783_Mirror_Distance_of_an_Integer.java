class Solution {
    public int reverse(int val){
        int rev=0;
        while(val!=0){
            rev*=10;
            rev+=(val%10);
            val/=10;
        }
        return rev;
    }
    public int mirrorDistance(int n) {
        return Math.abs(n-reverse(n));
    }
}