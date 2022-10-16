class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);
        int firstIndex = 0;
        int lastIndex = nums.length - 1;
        while(firstIndex <= lastIndex){
            int middleIndex = (firstIndex + lastIndex) / 2;
            if(nums[middleIndex] == target) return middleIndex;
            else if(nums[middleIndex] < target) firstIndex = middleIndex + 1;
            else if(nums[middleIndex] > target) lastIndex = middleIndex - 1;
        }
        return -1;
    }
}