class 1848_Minimum_Distance_to_the_Target_Element {
    public int getMinDistance(int[] nums, int target, int start) {
        int i=start;
        int j=start;
        int n=nums.length;

        while(i>=0 && j<n ){
            if(nums[i]==target) return Math.abs(i-start);
            if(nums[j]==target) return Math.abs(j-start);
            i--;
            j++;
        }
        while(i>=0){
        if(nums[i]==target) return Math.abs(i-start);
        i--;
        }
        while(j<n){
        if(nums[j]==target) return Math.abs(j-start);
        j++;
        }

        return -1;
    }
}