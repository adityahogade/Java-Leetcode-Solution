class Solution {

    public int maxDistance(int[] nums1, int[] nums2) {
        int len=0;
        int i=0,j=0;
        int n=nums1.length;
        int m=nums2.length;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
            len=Math.max(len,j-i);
           
                j++;
            }
            else    i++;
        }
        return len;
    }
}