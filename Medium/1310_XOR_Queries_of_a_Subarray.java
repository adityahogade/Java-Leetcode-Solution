class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int m=queries.length;
        int n=arr.length;
        int[] p=new int[n+1];
        int ans[]=new int[m];

        for(int i=1;i<=n;i++)            p[i]=p[i-1]^arr[i-1];

        for(int k=0;k<m;k++){
            int i=queries[k][0];
            int j=queries[k][1];

            ans[k]=p[i]^p[j+1];

        }
        return ans;
        
    }
}