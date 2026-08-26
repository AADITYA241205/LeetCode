class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();
        int row = 0;
        int rowl = matrix.length - 1;
        int col = 0;
        int col1 = matrix[0].length - 1;
        int i = 0;
        int j =0;
        int flag = 0;
        while(row<=rowl && col<=col1){
            if(flag==0){
                ans.add(matrix[i][j]);
                if(j==col1){
                    flag = (flag+1)%4;
                    row++;
                    i = row;
                }
                else{
                    j++;
                }
            }
            else if(flag==1){
                ans.add(matrix[i][j]);
                if(i==rowl){
                    flag = (flag+1)%4;
                    col1--;
                    j = col1;
                }
                else{
                    i++;
                }
                
            }
            else if(flag==2){
                ans.add(matrix[i][j]);
                if(j==col){
                    flag = (flag+1)%4;
                    rowl--;
                    i = rowl;
                }
                else{
                    j--;
                }
            }
            else if(flag==3){
                ans.add(matrix[i][j]);
                if(i==row){
                    flag = (flag+1)%4;
                    col++;
                    j = col;
                }
                else{
                    i--;
                }
            }
        }

        return ans;

    }
}