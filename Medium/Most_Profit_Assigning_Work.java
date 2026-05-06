class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n=difficulty.length;
         int[][] pair = new int[n][2];

        for (int i = 0; i < n; i++) {
            pair[i][0] = profit[i];
            pair[i][1] = difficulty[i];
        }
         Arrays.sort(pair, (x, y) -> Integer.compare(y[0], x[0]));
        for (int i = 0; i < n; i++) {
            profit[i] = pair[i][0];
            difficulty[i] = pair[i][1];
        }
        int pro=0;
        for(int i=0;i<worker.length;i++){
            for(int j=0;j<n;j++){
                if(worker[i]>=difficulty[j]){
                    pro+=profit[j];
                    break;
                }
            }
        }
return pro;
    }
}