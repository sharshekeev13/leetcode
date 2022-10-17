class Solution {
    public int singleNumber(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; ++i){
            if(!result.contains(nums[i])) result.add(nums[i]);
            else if(result.contains(nums[i])) result.remove(result.indexOf(nums[i]));
        }
        return result.get(0);
    }
}