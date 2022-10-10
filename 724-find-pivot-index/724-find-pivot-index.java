class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        for(int pivot = 0; pivot < nums.length;pivot++){
            int right =0;
            for(int r = pivot+1; r < nums.length; r++){
                right += nums[r];
            }
        if(left == right){
            return pivot;
        }
        left += nums[pivot];
        }
        return -1;
    }
}