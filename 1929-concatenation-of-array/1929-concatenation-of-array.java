class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length * 2];
        int first = 0;
        int half = nums.length;
        for(int i = 0; i < nums.length; i++){
            result[first] = nums[i];
            result[half] = nums[i];
            first++;
            half++;
        }
        return result;
    }
}