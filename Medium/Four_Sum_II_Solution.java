class Four_Sum_II_Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer> hm1= new HashMap<>();
        int n=nums1.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=nums1[i]+nums2[j];
                hm1.put(sum , hm1.getOrDefault(sum,0)+1);
            }
        }
int count=0;
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int sum=nums3[i]+nums4[j];
                if(hm1.containsKey((-sum))){
                    count+=hm1.get((-sum));
                }
            }
        }
        return count;
    }
}