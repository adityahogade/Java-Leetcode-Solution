class Solution {
   List<List<Integer>> ans=new ArrayList<>();
   
    public void combSum(int target,int sum,List<Integer> ans_li,List<Integer> cand){
            if(sum==target){
                ans.add(ans_li);
                return;
            }
            if(sum>target || cand.size()==0) return;
                List<Integer> li=new ArrayList<>(cand);
            for(int i=0;i<cand.size();i++){
                int ele=cand.get(i);
               
                List<Integer> ansli=new ArrayList<>(ans_li);
                ansli.add(ele);
                //System.out.println(ele);

                combSum(target,sum+ele,ansli,li);
                 li.remove(Integer.valueOf(ele));

            }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> li=Arrays.stream(candidates)
                                .boxed()
                                .collect(Collectors.toList());

        List<Integer> ansLi=new ArrayList<>();

        combSum(target,0,ansLi,li);
        return ans;
    }
}