class Solution {
    public int countSpecialIntegers(int[] nums) {

        int[] arr = new int[101];
        for(int i = 0 ; i<nums.length ; i++){
            arr[nums[i]]++;
        }

        int ans = 0;
        for(int i = 0 ; i<arr.length ; i++){
            if(arr[i]==3){
                int i1 = -1;
                int i2 = -1;
                int i3 = -1;
                for (int j = 0; j < nums.length;j++) {
                    if(nums[j] == i){
                        if(i1 == -1){
                            i1 = j;
                        } 
                        else if(i2 == -1){
                            i2 = j;
                        } 
                        else{
                            i3 = j;
                        }
                    }
                }
                if (i2 - i1 == i3 - i2)ans++;

            }
        }

        return ans;
        
    }
}