class Solution {
    public long shadowPairs(int[] nums) {
        long c=0;
        
        int n=nums.length;
       ArrayList<Integer> st=new ArrayList<>();
        for(int x: nums){
            while(!st.isEmpty() && st.get(st.size()-1)>x){
                st.remove(st.size()-1);
            }
            int l=0,r=st.size();
            while(l<r){
                int mid=l+(r-l)/2;
                if(st.get(mid)<x) l=mid+1;
                else r=mid;
            }
            c+=l;
            st.add(x);
        }
        return c;
    }
}