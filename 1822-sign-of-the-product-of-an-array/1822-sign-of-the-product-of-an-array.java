class Solution {
    public int arraySign(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                result++;
            }else if(nums[i] == 0){
                return 0;
            }
        }
        System.out.println(result);
        if(result % 2 == 0) return 1;
        return -1;
    }
}