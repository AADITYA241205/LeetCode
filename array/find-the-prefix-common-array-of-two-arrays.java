class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {

        int[] ans = new int[A.length];
        int[] freq = new int[A.length+1];


        for(int i = 0 ; i<A.length ; i++){

            int c = 0;
            freq[A[i]]++;
            freq[B[i]]++;

            for(int j = 0 ; j<freq.length ; j++){
                if(freq[j]==2){
                    c++;
                }
            }
            ans[i] = c;
        }
        
        return ans;
    }
}