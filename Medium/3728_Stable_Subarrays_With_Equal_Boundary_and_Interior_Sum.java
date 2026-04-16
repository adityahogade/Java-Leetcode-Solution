class Solution {
    public long countStableSubarrays(int[] capacity) {
        long count=0;
        int n=capacity.length;
        Map<String,Integer> hm=new HashMap<>();
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=capacity[i];
            long needed=sum- 2L * capacity[i];
            String reqStr=needed + ","+capacity[i];
            if(hm.containsKey(reqStr)){
                count+= hm.get(reqStr);
            }

            String addStr=sum+","+capacity[i];
            hm.put(addStr,hm.getOrDefault(addStr,0)+1);
        }
        for(int i=0;i<n-1;i++){
            if(capacity[i]==0 && capacity[i+1]==0) count--;
        }
        return count;
    }
}