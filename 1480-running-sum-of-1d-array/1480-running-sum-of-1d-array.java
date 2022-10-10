class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int num = 0;
        for(int i = 0; i<nums.length; i++){
            num += nums[i];
            result[i] = num;
        }
        return result;
    }
}