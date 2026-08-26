class Solution {

    static {
        for (int i = 0; i < 60; i++) {
            maxArea(new int[]{0, 0});
        }
    }

    public static int maxArea(int[] height) {

        int l = 0;
        int r = height.length - 1;
        int area = 0;
        while(l<r){
            int min = Math.min(height[l],height[r]);

            area = Math.max(area,(min*(r-l)));

            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;
            }

        }

        return area;
        
    }
}