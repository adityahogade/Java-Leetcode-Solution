class Solution {
    public int firstStableIndex(int[] nums, int k) {
        TreeMap<Integer,Integer> asc=new TreeMap<>();
         TreeMap<Integer,Integer> desc = new TreeMap<>(Collections.reverseOrder());

         for(int i=0;i<nums.length;i++)   {
            asc.put(nums[i],asc.getOrDefault(nums[i],0)+1);
         }

         for(int i=0;i<nums.length;i++){
            desc.put(nums[i],desc.getOrDefault(nums[i],0)+1);

            int max= desc.firstKey();
            int min=asc.firstKey();
            if((max-min)<=k)return i;
         if(asc.get(nums[i])<=1){
            asc.remove(nums[i]);
         }
         else{
            asc.put(nums[i],asc.get(nums[i])-1);
         }
         }

        return -1;
    }
}