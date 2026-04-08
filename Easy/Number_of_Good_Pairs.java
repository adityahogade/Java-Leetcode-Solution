class Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);

        }
        int ans=0;
        for(int val: hm.keySet()){
            int value=hm.get(val);
            ans+= (value*(value-1))/2;
        }
        return ans;
    }
}