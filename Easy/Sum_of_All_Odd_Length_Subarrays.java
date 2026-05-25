class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n=arr.length;
        int pref[]= new int[n+1];
        pref[1]=arr[0];
        for(int i=1;i<n;i++){
            pref[i+1]=pref[i]+arr[i];
        }
int sum=pref[n];
        for(int j=3;j<=n;j=j+2){
            int e=j;
            for(int i=1;e<=n;i++){
                sum+=(pref[e]-pref[i-1]);
                e++;
            
            }
        }
        return  sum;


    }
}