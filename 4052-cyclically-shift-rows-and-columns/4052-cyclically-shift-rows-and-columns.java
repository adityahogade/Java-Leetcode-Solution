class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] prev=new int[n][n];
        int ans[][]=new int[n][n];

        for(int i=0;i<n;i++){
            int k=rowShift[i];
            for(int j=0;j<n;j++){
                int row=(j-k+n)%n;
                prev[i][row]=grid[i][j];
            }
        }
        ans= Arrays.copyOf(prev,n);
        prev=new int[n][n];
        for(int j=0;j<n;j++){
            int k=colShift[j];
            for(int i=0;i<n;i++){
                int col=(i-k+n)%n;
                prev[col][j]=ans[i][j];
            }
        }
        return prev;
    }
}