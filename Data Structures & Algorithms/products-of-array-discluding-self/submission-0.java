class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int product = 1;
        int zeros = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i]==0){
                zeros++;
            }
            else {
                product *= nums[i];
            }
        }

        if (zeros > 1){
            return result;
        }

        for (int j = 0; j < nums.length; j++){
            if (zeros > 0){
                if (nums[j] == 0){
                    result[j] = product;
                }
                else {
                    result[j] = 0;
                }
            }
            else {
                result[j] = product / nums[j];
            }
        }
        return result;
    }
}  
