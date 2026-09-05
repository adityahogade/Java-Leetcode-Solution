class Solution {
    List<List<Integer>> ans=new ArrayList<>();

     public void subset_Backtrack(int[] nums,int start,int end,List<Integer> sub){
        if(start==end){
            ans.add(sub);
            return;
        }
        if(start>end) return ;

        ans.add(sub);

        for(int i=start;i<end;i++){
            int ele=nums[i];
            List<Integer> sub1=new ArrayList<>(sub);
            sub1.add(ele);
            subset_Backtrack(nums,i+1,end,sub1);
        }
     }
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subset_li=new ArrayList<>();
        subset_Backtrack(nums,0,nums.length,subset_li);
return ans;
        
    }
}