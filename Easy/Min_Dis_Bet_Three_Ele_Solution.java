class Min_Dis_Bet_Three_Ele_Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer, List<Integer>> hm =new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n ;i++){
            hm.computeIfAbsent(nums[i],k -> new ArrayList<>()).add(i);

        }
    int ans=Integer.MAX_VALUE;
        for( List<Integer> li : hm.values() ){
            if(li.size()>=3){
                for(int i=0;i+2<li.size();i++){
                    int a=li.get(i);
                    int b=li.get(i+1);
                    int c=li.get(i+2);
                    int dis= 2*(c-a);
                    ans =  dis<ans ? dis : ans;

                }

            }
        }

        
        return ans == Integer.MAX_VALUE ? -1 :ans;
    }
}