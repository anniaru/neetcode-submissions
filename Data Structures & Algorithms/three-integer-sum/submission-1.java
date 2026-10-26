class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<List<Integer>>();
        Arrays.sort(nums);

        for (int fixed = 0; fixed < nums.length - 2; fixed++){
            if (fixed > 0 && nums[fixed] == nums[fixed - 1]){
                continue;
            }

            if (nums[fixed] > 0){
                break;
            }

            int left = fixed + 1;
            int right = nums.length - 1;
            int target = 0 - nums[fixed];

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum == target) {
                    List<Integer> triplet = Arrays.asList(nums[fixed], nums[left], nums[right]);
                    triplets.add(triplet);
                    

                    while (left < right && nums[left] == nums[left+1]){
                        left++;
                    }
                    while (left < right && nums[right] == nums[right-1]){
                        right--;
                    }
                    
                    left++;
                    right--;
                }
                else if (sum < target) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return triplets;
    }
}
