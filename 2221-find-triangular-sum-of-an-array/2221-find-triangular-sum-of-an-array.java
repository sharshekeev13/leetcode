class Solution {
    public int triangularSum(int[] nums) {
        while(nums.length != 1){
            int[] arr = new int[nums.length - 1];
            for(int i = 0; i < nums.length - 1; i++){
                int t = nums[i] + nums[i+1];
                if(t > 9) arr[i] = t%10;
                else arr[i] = t;
            }
            nums = arr;
        }
        return nums[0];
    }
}