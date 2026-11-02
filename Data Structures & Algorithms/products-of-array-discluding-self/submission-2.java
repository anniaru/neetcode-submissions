// Without division
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int[] result = new int[nums.length];
        
        // 1 - populate prefix array, cumulative approach. product of everything to the left of i
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            prefix[i] = nums[i] * prefix[i - 1];
        }

        // 2 - populate suffix array, working back from end of array, cumulative approach. product of everything to the right of i
        int end = nums.length - 1;
        suffix[end] = nums[end];
        for (int i = end - 1; i >= 0; i--){
            suffix[i] = nums[i] * suffix[i + 1];
        }

        // 3 - for every index i, we multiply the i - 1th element in prefix by the i + 1th element in suffix
        // i.e., the i - 1th element in prefix is the product of all numbers in nums before index i
              // the i + 1th element in suffix is the product of all numbers in nums after index i
        result[0] = suffix[1];
        result[end] = prefix[end - 1];
        for (int i = 1; i < end; i++){
            result[i] = prefix[i - 1] * suffix[i + 1];
        }

        return result;
    }
}  
