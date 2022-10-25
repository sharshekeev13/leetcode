class Solution {
    public int findMiddleIndex(int[] nums) {
        int lSum = 0;
        for(int i = 0; i < nums.length; i++) {
            int rSum = 0;
            for(int j = i+1; j < nums.length; j++) {
                rSum+=nums[j];
            }
            if(lSum == rSum) return i;
            else lSum+=nums[i];
        }
        return -1;
    }
}