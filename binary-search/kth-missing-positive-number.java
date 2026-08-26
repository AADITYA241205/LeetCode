class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int low = 0;

        int high = arr.length - 1;

        while(low<=high){
            int mid = low + (high-low)/2;
            if(check(arr,mid,k)){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }

        }
        return low+k;

    }
    boolean check(int[] arr , int mid , int k){
        int a = arr[mid] - (mid+1);

        return a<k;
    }
}