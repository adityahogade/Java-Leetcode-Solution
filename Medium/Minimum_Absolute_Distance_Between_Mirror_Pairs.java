class Solution {
    public int reverse(int val){
        int new_val=0;
        while(val!=0){
            int ele=val%10;
            new_val*=10;
            new_val+=ele;
            val/=10;
        }
        return new_val;
    }
    public int minMirrorPairDistance(int[] nums) {
            int min=Integer.MAX_VALUE;
            HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]))    min=Math.min((i-hm.get(nums[i])),min);
            
            int val=reverse(nums[i]);
            hm.put(val,i);
        }
        return min==Integer.MAX_VALUE ? -1 : min;
    }
}