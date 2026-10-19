class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int TargetCou=0;
        int EleLessthenTar = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) TargetCou++;
            else if(nums[i]<target) EleLessthenTar++;
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=EleLessthenTar ;i<TargetCou+EleLessthenTar ;i++){
            ans.add(i);
        }
        return ans;
        
    }
}