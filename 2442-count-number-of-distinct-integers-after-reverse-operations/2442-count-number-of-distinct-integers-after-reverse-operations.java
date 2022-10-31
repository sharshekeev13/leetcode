class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for(int x : nums){
            result.add(x);
        }
        for(int i = 0; i < nums.length; i++) {
           result.add(Integer.parseInt(new StringBuilder(String.valueOf(nums[i])).reverse().toString()));
        }
        return result.size();
    }
}