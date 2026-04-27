class Solution {
    public int descStart(int[] arr){
    int l=0;
    int r=arr.length;

   for(int i=1;i<r-1;i++){
       if(arr[i]>arr[i-1] && arr[i]>arr[i+1]) return i+1;
   }
        return -1;
    }
    public int compareBitonicSums(int[] nums) {
        int n=nums.length;
        long[] p=new long[n];
        p[0]=nums[0];
        for(int i=1;i<n;i++) p[i]=p[i-1]+nums[i];
        int l=0;
        int r=n-1;
            
        int ind= descStart(nums);
        
        if(p[ind-1]==(p[n-1]- p[ind-2])) return -1;
        else if(p[ind-1]>p[n-1]-p[ind-2]) return 0;
        
        return 1;
    }
}