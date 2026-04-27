class Solution {
    public int maxDistance(int[] colors) {
      int max=Integer.MIN_VALUE;
      int a=0;
       for(int i=0;i<colors.length;i++){
        for(int j=i+1;j<colors.length;j++){
            if(colors[i]!=colors[j]){
                a=Math.abs(i-j);
            }
            if(a>max){
                max=a;
            }
        }
       }
       return max;
    }
}