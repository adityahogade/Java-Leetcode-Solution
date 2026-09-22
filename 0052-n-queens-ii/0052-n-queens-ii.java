class Solution {
    public boolean isSafe(int n,int row,int col,List<String> board){

        //horizontal
        for(int j=row;j>=0;j--){
            String str=board.get(j);
            if(str.charAt(col)=='Q') return false;
        }

        //left dig
        int i=col;
        for(int j=row;j>=0 && i>=0 ; j-- ){
            if(board.get(j).charAt(i)=='Q') return false;
            i--;
        }

        //right dig
         i=col;
        for(int j=row;j>=0 && i<n ; j-- ){
            if(board.get(j).charAt(i)=='Q') return false;
            i++;
        }
        return true;
    }
    int c=0;
    public void NQueen(int n,int  row,List<String> board){
        if(row==n) {
            c++;
            return;
        }
        for(int i=0;i<n;i++){
            if(isSafe(n,row,i,board)){

               board.set(row, board.get(row).substring(0, i) + 'Q' +board.get(row).substring(i + 1));

                NQueen(n,row+1,board);
                board.set(row,board.get(row).substring(0,i)+'.'+board.get(row).substring(i+1));

            }
        }

        
    }
    public int totalNQueens(int n) {
  List<String> board=new ArrayList<>();
        for(int i=0;i<n;i++){
            String str="";
            for(int j=0;j<n;j++) str=str+"." ;
            board.add(str);
        }
        NQueen(n,0,board);
        return c;       
    }
}