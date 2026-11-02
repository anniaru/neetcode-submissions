// Without division
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        
        // populate prefix array, cumulative approach
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            prefix[i] = nums[i] * prefix[i - 1];
        }

        // populate suffix array, working back from end of array, cumulative approach
        int end = nums.length - 1;
        suffix[end] = nums[end];
        for (int i = end - 1; i >= 0; i--){
            suffix[i] = nums[i] * suffix[i + 1];
        }

        result[0] = suffix[1];
        result[end] = prefix[end - 1];
        for (int i = 1; i < end; i++){
            result[i] = prefix[i - 1] * suffix[i + 1];
        }

        return result;
    }
}  
