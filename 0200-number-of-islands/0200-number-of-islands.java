class Solution {
    int ans=0;

    public void checkIsland(char[][] grid,boolean[][] visited,int i,int j,int n,int m){
        if (i < 0 || j < 0 || i >= n || j >= m ||
            visited[i][j] || grid[i][j] == '0') {
            return;
        }

        visited[i][j] = true;

        checkIsland(grid, visited, i + 1, j, n, m);
        checkIsland(grid, visited, i - 1, j, n, m);
        checkIsland(grid, visited, i, j + 1, n, m);
        checkIsland(grid, visited, i, j - 1, n, m);
        
    }
    
    public int numIslands(char[][] grid) {
    int n=grid.length;
    int m=grid[0].length;
    boolean visited[][] =new boolean[n][m];
   for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1' && !visited[i][j]) {
                    ans++;
                    checkIsland(grid, visited, i, j, n, m);
                }
                       }           }
    return ans;

    }
}