class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        int end = nums.length - 1;
        for(int i = 0; i < nums.length/2; i++){
            if(nums[i]+nums[end] > res) res = nums[i]+nums[end];
            end--;
        }
        return res;
    }
}