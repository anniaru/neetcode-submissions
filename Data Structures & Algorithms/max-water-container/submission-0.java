class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int highestArea = 0;
        while (left < right){
            int height = Math.min(heights[left], heights[right]);
            int width = right - left;
            int area = height * width;

            highestArea = Math.max(area, highestArea);

            if (heights[left] < heights[right]){
                left++;
            }
            else if (heights[left] > heights[right]){
                right--;
            }
            else {
                left++;
            }
        }
        return highestArea;
    }
}
