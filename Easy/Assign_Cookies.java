class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=g.length;
        int m=s.length;
        int i=0,j=0;
        int c=0;
        Arrays.sort(g);
        Arrays.sort(s);
        
        while(i<n && j<m){
            if(g[i]<=s[j]){
                c++;
                i++;
                j++;
            }
            else j++;
        }
      return c;  
    }
}