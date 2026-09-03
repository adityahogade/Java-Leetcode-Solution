class Solution {
    Set<List<Integer>> ans=new LinkedHashSet<>();
    public void uniqPerm(List<Integer> myLi,List<Integer> perm){
        int n=myLi.size();
        if(n==0){
            if(!ans.contains(perm)){
                ans.add(perm);
            }
            return;
}
for(int i=0;i<n;i++){
    int curr =myLi.get(i);
    List<Integer> newpem= new ArrayList<>(perm);
    newpem.add(curr);
    List<Integer> newli=skipEle(myLi,i);
    uniqPerm(newli,newpem);
}


    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> perm=new ArrayList<>();
        List<Integer> myList=Arrays.stream(nums)
                             .boxed()
                             .collect(Collectors.toList());




        uniqPerm(myList,perm);
        List<List<Integer>> myans = new ArrayList<>(ans);


     return myans;   
    }
    public List<Integer> skipEle(List<Integer> li,int ind){
        List<Integer> skiped=new ArrayList<>(li);
        skiped.remove(ind);
        return skiped;
    }
}