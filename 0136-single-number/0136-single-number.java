class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        
        for(int i = 1; i < len; i += 2) {
            if (nums[i] != nums[i-1]) {
                if ( i < len - 1 ) return nums[i-1];
                break;
            }
        }
        
        return nums[len - 1];
    }
}