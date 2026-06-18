class Solution {
    public int maxArea(int[] height) {
        int area = 0; 
        int left = 0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        while(left<right){
            int height1 = Math.min(height[left],height[right]);
            int width  = right-left;
            area = height1 * width ;
            if(area > max ) max = area;
            if(height[left]<height[right]) left++;
            else {
                right--;
            }
        }
        return max;
    }
}
