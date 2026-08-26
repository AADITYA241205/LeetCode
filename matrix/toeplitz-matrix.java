class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i = 0 ; i<matrix.length ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                int k = i;
                int l = j;
                int temp = matrix[i][j];
                while(k<matrix.length-1 && l<matrix[0].length-1){
                        k++;
                        l++;
                    if(temp == matrix[k][l]){
                    }
                    else{
                        return false;
                    }
                }
            }
        }

        return true;
    }
}