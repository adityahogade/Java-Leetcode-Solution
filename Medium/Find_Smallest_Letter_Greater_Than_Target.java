class Solution {
    public char nextGreatestLetter(char[] arr, char target) {
        int l=0,r=arr.length-1;
        int ans=0;

        while(l<=r){
            int mid=l+(r-l)/2;
            int asc_mid=0+arr[mid];
            int asc_tar=0+target;
            if(asc_mid >asc_tar){
                    ans=mid;
                    r=mid-1;
            }
            else l=mid+1;
        }
        return arr[ans];
    }
}