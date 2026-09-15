class Solution {
    List<List<String>> ans=new ArrayList<>();
    public boolean isSafe(int n,int row,int j,List<String> board){
        String str;
        for(int i=0;i<row ;i++){
            str=board.get(i);
            if(str.charAt(j)=='Q') return false;
        }
int ro=row-1;
        for(int k=j-1;k>=0 && ro>=0 ;k-- ){
            str=board.get(ro);
            if(str.charAt(k)=='Q') return false;
            ro--;
        }
      

        ro=row-1;
        for(int k=j+1;k<n && ro>=0 ;k++ ){
            str=board.get(ro);
            if(str.charAt(k)=='Q') return false;
            ro--;
        }
        return true;
    }

    public void NQueen(List<String> li,int row,int n){
        if(row==n){
            List<String> li1=new ArrayList<>(li);
            ans.add(li1);
            return;
        }
        for(int i=0;i<n;i++){
           
           if(isSafe(n,row,i,li)){
           li.set(row, li.get(row).substring(0, i) + 'Q' + li.get(row).substring(i + 1));

            NQueen(li,row+1,n);

             li.set(row, li.get(row).substring(0, i) + '.' + li.get(row).substring(i + 1));
        }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<String> board=new ArrayList<>();
        for(int i=0;i<n;i++){
            String str="";
            for(int j=0;j<n;j++) str=str+"." ;
            board.add(str);
        }

        NQueen(board,0,n);
        return ans;
    }
}