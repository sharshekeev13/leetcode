class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int counter = 1;
        for(int i = nums.length-1; i >= 0; i--){
            if(counter++ == k) return nums[i];
        }
        return -1;
    }
}