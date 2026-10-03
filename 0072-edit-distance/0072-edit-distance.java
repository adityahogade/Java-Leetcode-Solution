class Solution {
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        if(m==0 && n==0) return 0;
        if(n==0) return m;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++) dp[i][0]=i;
        for(int j=0;j<=m;j++)dp[0][j]=j;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(word1.charAt(j-1)!=word2.charAt(i-1)){
                    int min_val=Math.min(Math.min(dp[i-1][j-1],dp[i-1][j]),dp[i][j-1]);
                    dp[i][j]=min_val+1;
                }
                else dp[i][j]=dp[i-1][j-1];
            }
        }
  
        return dp[n][m];
    }
}