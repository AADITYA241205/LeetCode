class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] arr = new int[101];

        for (int num : nums) {
            arr[num]++;
        }

        int[] ans = new int[nums.length];
        int i = 0;
        
        while(i < nums.length){
            for(int num = 1; num <= 100; num++){

                if(arr[num]>0){
                    ans[i++] = num;
                    arr[num]--;
                }
            }
        }

        return ans;
    }
}