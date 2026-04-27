class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        Map<Integer,List<Integer>> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hm.computeIfAbsent(nums[i],k-> new ArrayList<>()).add(i);
        }

        List<Integer> ans=new ArrayList<>();
        for(int q : queries){
            int minLength=Integer.MAX_VALUE;
            int k=nums[q];
            
                List<Integer> li=hm.get(k);
                if(li.size()<=1){ 
                    ans.add(-1);
                    continue; 
                    }
               int pos = Collections.binarySearch(li, q);

            int prev = li.get((pos - 1 + li.size()) % li.size());
            int next = li.get((pos + 1) % li.size());
            int right = (next - q + n) % n;
            int left  = (q - prev + n) % n;

            ans.add(Math.min(right, left));
               
                    
                }
            
           
        
        return ans;
    }
}