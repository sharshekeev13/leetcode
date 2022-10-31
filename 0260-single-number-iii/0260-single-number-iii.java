class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(numbers.contains(nums[i])) numbers.remove(Integer.valueOf(nums[i]));
            else numbers.add(nums[i]);
        }
        return numbers.stream().mapToInt(i->i).toArray();
    }
}