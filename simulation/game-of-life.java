class Solution {
    public void gameOfLife(int[][] board) {
        for(int i = 0 ; i<board.length ; i++){
            for(int j = 0 ; j<board[0].length ; j++){
                int count = 0;
                for(int k = i - 1;k<=i+1 ; k++){
                    for(int l = j - 1 ; l<=j+1;l++){
                        if(k>=0 && k<board.length && l>=0 && l<board[0].length){
                            if(board[k][l]>=1){
                                if(k==i && l==j)continue;
                                count++;
                            }
                        }
                    }
                }
                if(board[i][j]==1 && (count==2 || count==3)){
                    board[i][j]=2;
                }
                else if(board[i][j]==0 && count==3){
                    board[i][j]=-1;
                }
                else if(board[i][j]==1){
                    board[i][j] = 3;
                }
                else{
                    board[i][j] = 0;
                }
            }
        }
        for(int i = 0 ; i<board.length ; i++){
            for(int j = 0 ; j<board[0].length ; j++){
                if(board[i][j]==3){
                    board[i][j]=0;
                }
                else if(board[i][j]==-1){
                    board[i][j]=1;
                }
                else if(board[i][j]==2){
                    board[i][j]=1;
                }
            }
        }            
    }
}