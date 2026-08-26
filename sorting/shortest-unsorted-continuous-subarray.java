class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int i = 1;
        int j = 0;
        while(i<nums.length){
            if(nums[i]<nums[j]){
                break;
            }
            j++;
            i++;
        }

        i = nums.length - 2;
        int k = nums.length - 1;
        while(i>=0){
            if(nums[i]>nums[k]){
                break;
            }
            k--;
            i--;
        }
        if(j==nums.length-1 && k==0)return 0;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int l = j ; l<=k ;l++){
            min = Math.min(min,nums[l]);
            max = Math.max(max,nums[l]);
        }

        while(j>0 && nums[j-1]>min){
            j--;
        }
        while(k<nums.length - 1 && nums[k+1]<max){
            k++;
        }

        return k-j+1;
        
    }
}