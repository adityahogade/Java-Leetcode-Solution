class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int n=nums.length;
        int j=0;
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++){
            if(nums[i]==x){
                 arr[j][0]=1;
                 arr[j][1]=i;
                 j++;
            }

        }
        int m=queries.length;
        int ans[]=new int[m];
        for(int i=0;i<m;i++){
            if(queries[i]>n) ans[i]=-1;
            else{
                if(arr[queries[i]-1][0]==1){
                    ans[i]=arr[queries[i]-1][1];
                }
                else ans[i]=-1;
            }
        }
        return ans;
    }
}