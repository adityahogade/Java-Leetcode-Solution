class Solution {
  Boolean[][][] dp;    

    public boolean validPath(char[][] grid,int i,int j,int n,int m,int balance){
           if(grid[i][j]=='(') balance++;
        else balance--;

      if(balance<0)return false;
      int remaining= (n-1-i)+(m-1-j);
      if(balance>remaining) return false;
       
          if(i==n-1 && j==m-1){
            
            return balance==0 ;
          }
     

        if(dp[i][j][balance]!=null) return dp[i][j][balance];
        boolean ans=false;
        
        if(i<n-1){
            ans=validPath(grid,i+1,j,n,m,balance);
        }
        if(!ans && j<m-1){
            ans=validPath(grid,i,j+1,n,m,balance);
        }
        return dp[i][j][balance]=ans ;
    }
    public boolean hasValidPath(char[][] grid) {

           int n = grid.length;
        int m = grid[0].length;
        if(grid[0][0]!='(' || grid[n-1][m-1]!=')')return false;
           if ((n + m - 1) % 2 != 0)
            return false;

        dp = new Boolean[n][m][n + m + 1];
        return validPath(grid,0,0,n,m,0);
    }
}