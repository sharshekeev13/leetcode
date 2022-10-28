class Solution {
    public boolean divideArray(int[] nums) {
        int numOfPairs = nums.length/2;
        int pairs = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j] && nums[i] != 0 && nums[j] != 0){
                    pairs++;
                    nums[i] = 0;
                    nums[j] = 0;
                }
            }
        }
        return pairs == numOfPairs;
    }
}