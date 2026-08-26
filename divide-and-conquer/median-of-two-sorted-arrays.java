class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int k = 0;
        int[] arr = new int[nums1.length+nums2.length];

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                arr[k] = nums1[i];
                k++;
                i++;
            }
            else{
                arr[k] = nums2[j];
                k++;
                j++;
            }
        }

        while(i<nums1.length){
            arr[k] = nums1[i];
            k++;
            i++;
        }

        while(j<nums2.length){
            arr[k] = nums2[j];
            k++;
            j++;
        }

        if((nums1.length+nums2.length)%2!=0){
            return arr[(nums1.length+nums2.length)/2];
        }
        else{
            int a = arr[(nums1.length+nums2.length-1)/2];
            int b = arr[(nums1.length+nums2.length)/2];
            return (a+b)/2.0;
        }
        
    }
}