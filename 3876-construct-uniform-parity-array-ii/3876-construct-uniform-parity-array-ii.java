class Solution {
    public boolean uniformArray(int[] nums1) {
       
        Arrays.sort(nums1);
        int n=nums1.length;
        boolean makeEven=true;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=0 && (nums1[i]-nums1[0])%2!=0){
                makeEven=false;
                break;
            }
        }
        boolean makeOdd=true;
        for(int i=0;i<n;i++){
            if(nums1[i]%2!=1 && (nums1[i]-nums1[0])%2!=1){
                makeOdd=false;
                break;
            }
        }
        return makeEven||makeOdd;
        
    }
}