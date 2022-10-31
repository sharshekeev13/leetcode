class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(start == -1) start = i;
                else{
                    end = i;
                }
            }          
        }
        if(start != -1 && end == -1) end = start;
        return new int[]{start,end};
    }
}