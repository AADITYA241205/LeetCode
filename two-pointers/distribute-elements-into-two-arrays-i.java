class Solution {
    public int[] resultArray(int[] nums) {

        int arr1[] = new int[nums.length];
        int arr2[] = new int[nums.length];

        arr1[0] = nums[0];
        arr2[0] = nums[1];

        int i = 2;
        int j = 0;
        int k = 0;

        while(i<nums.length){

            if(arr1[j]>arr2[k]){
                j++;
                arr1[j] = nums[i];
            }
            else{
                k++;
                arr2[k] = nums[i];
            }
            i++;
        }

        int[] ans = new int[nums.length];
        int id = 0;
        for(int l : arr1) if(l!=0) ans[id++] = l;
        for(int l : arr2) if(l!=0) ans[id++] = l;

        return ans;
        
    }
}