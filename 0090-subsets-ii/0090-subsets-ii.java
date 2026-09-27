class Solution {
    Set<List<Integer>> ans=new LinkedHashSet<>();
    public void subSetII(int[] nums,List<Integer> li , int start,int end){
        if(start<=end && !ans.contains(li)){
            List<Integer> li1=new ArrayList<>(li);
            ans.add(li1);
        }
        if(start>=end) {
            return;
        }
       
        for(int i=start;i<end;i++){
            List<Integer> li2=new ArrayList<>(li);
            li2.add(nums[i]);
            subSetII(nums,li2,i+1,end);
        }       
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> li=new ArrayList<>();
        subSetII(nums,li,0,nums.length);
        List<List<Integer>> ansLi=new ArrayList<>(ans);
        return ansLi;
    }
}