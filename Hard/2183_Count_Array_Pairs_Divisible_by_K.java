class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long countPairs(int[] nums, int k) {
        long count=0;
        HashMap<Long,Integer> gcd=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            long gcd1=gcd(nums[i],k);
            for(long gcd2: gcd.keySet()){
                if((gcd1*gcd2)%k  == 0){
                    count+=gcd.get(gcd2);
                }
                
            }
            gcd.put(gcd1,gcd.getOrDefault(gcd1,0)+1);
        }
        return count;
    }
}