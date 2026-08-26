class Solution {
    public int[] arrayRankTransform(int[] arr) {

        if(arr.length==0) return arr;

        int[] nums = new int[arr.length];

        for(int i = 0 ; i<arr.length ; i++){
            nums[i] = arr[i];
        }

        Arrays.sort(nums);
        HashMap<Integer,Integer> temp = new HashMap<>();

        int rank = 1;
        for(int i = 0 ; i<arr.length ; i++){
            if(!temp.containsKey(nums[i])){
                temp.put(nums[i],rank);
                rank++;
            }
        }

        for(int i = 0 ; i<arr.length ; i++){
            nums[i] = temp.get(arr[i]);
        }        


        return nums;
    }
}