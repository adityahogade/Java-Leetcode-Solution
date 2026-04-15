class Solution {
    public int sum_val(int[] p,int l,int r){
        if(l==0)return p[r];
        return p[r]-p[l-1];
    }
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen) {
        int n=nums.length;

        int p[]=new int[n];
        
        p[0]=nums[0];
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+nums[i];
        }
        int maxSum=0;
        int max1 = sum_val(p, 0, firstLen - 1);
        for(int i=firstLen+secondLen-1 ;i<n;i++){
            int first=sum_val(p,i-firstLen - secondLen +1,i-secondLen);
            max1=Math.max(max1,first);
            int second= sum_val(p,i-secondLen+1,i);

            maxSum=Math.max(max1+second,maxSum);

        }

        int max2 = sum_val(p, 0, secondLen - 1);
        for(int i=firstLen+secondLen-1 ;i<n;i++){
            int first=sum_val(p,i-firstLen - secondLen +1,i-firstLen);
             max2=Math.max(max2,first);
            int second= sum_val(p,i-firstLen+1,i);

            maxSum=Math.max(max2+second,maxSum);

        }
return maxSum;
    }
}