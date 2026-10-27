class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            int midIndex = low + (high - low) / 2;
            if (nums[midIndex] == target){
                return midIndex;
            }
            else if(target < nums[midIndex]){
                high = midIndex - 1;
            }
            else {
                low = midIndex + 1;
            }
        }
        return -1;

    }
}
