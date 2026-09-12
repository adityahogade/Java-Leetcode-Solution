class Solution {
    public    List<List<Integer>> ans=new ArrayList<>();

    public void comb(int start,int n,List<Integer> li,int k){
        if(k==0) {
            ans.add(li);
            return ;
        }
        for(int i=start;i<=n;i++){
            //if(((n-i)+1)<=k) return;
            List<Integer> newli=new ArrayList<>(li);
            newli.add(i);
            comb(i+1,n,newli,k-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        if(n<k) return ans;
        if(k==0) return ans;
        List<Integer> li=new ArrayList<>();
        comb(1,n,li,k);
        return ans;
    }
}