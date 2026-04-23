class Solution {
    public long[] distance(int[] nums) {
        Map<Integer,List<Long>> hm=new HashMap<>();
        int n=nums.length;
        long ans[]=new long[n];

        for(int i=0;i<n;i++){

            if(hm.containsKey(nums[i])){
                long val=hm.get(nums[i]).get(0);
                long count=hm.get(nums[i]).get(1);
                long dif= (count*i)-val;
                ans[i]=dif;
                hm.get(nums[i]).set(1,count+1);
                hm.get(nums[i]).set(0,val+(long)i);
            }
            else{
                hm.put(nums[i], new ArrayList<>(Arrays.asList((long)i,1L)));
            }
            }
        Map<Integer,List<Long>> hm2=new HashMap<>();

            for(int j=n-1;j>=0;j--){
                if(hm2.containsKey(nums[j])){
                long val=hm2.get(nums[j]).get(0);
                long count=hm2.get(nums[j]).get(1);
                long dif= val - (count*j);
                ans[j]=ans[j]+dif;
                hm2.get(nums[j]).set(1,count+1);
                hm2.get(nums[j]).set(0,val+(long)j);
                }
                else{
                hm2.put(nums[j], new ArrayList<>(Arrays.asList((long)j,1L)));

                }
            }
        return ans;    
        }
        
}