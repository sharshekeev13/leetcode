class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxResult = 0;
        int result = 0;
        for(int num:nums){
            if(num != 0){
                result++;
            }else if(num == 0){
                if(result > maxResult){
                    maxResult = result;
                }
                result = 0;
            }
        }
        if(result > maxResult) return result;
        return maxResult;
    }
}