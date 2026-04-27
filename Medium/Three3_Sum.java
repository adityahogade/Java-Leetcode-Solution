class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        // code Here
         List<List<Integer>> res= new ArrayList<>();

        Arrays.sort(arr);
        int n=arr.length;
        
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;
            while(l<r){
            int sum=arr[i]+arr[l]+arr[r];
            if(sum == 0){
		res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;

                    while(l<r && nums[l]==nums[l-1])l++;
                    while(l<r && nums[r]==nums[r+1] ) r--;
}
            if(sum>target) r--;
            else l++;
            }
            
        }
        return res;
        
    }
}