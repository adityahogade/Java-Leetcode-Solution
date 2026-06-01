class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int i=0;i<nums.length;i++)  hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        int c=0;
        for(int i:hm.keySet()){
            if(hm.containsKey(i+1)){
                c=Math.max(c,hm.get(i+1)+hm.get(i));
            }
            
        }
        return c;
    }
}