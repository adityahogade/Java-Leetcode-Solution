class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int arr2[] = new int[n];
        for(int i = 0; i < n; i++) {
            arr2[i] = nums[i];
        }
        Arrays.sort(arr2);

        boolean valid=false;
        for(int x=0;x<n;x++){
            for(int j=0;j<n;j++){
                if(arr2[j]==nums[(j+x)%n]){
                    valid=true;
                }
                else {
                    valid =false ;
                    break;
                }
            }
            if(valid==true) return true;
        }
        return false;
    }

}