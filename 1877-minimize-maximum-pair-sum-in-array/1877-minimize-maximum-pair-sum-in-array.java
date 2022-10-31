class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        int end = nums.length - 1;
        for(int i = 0; i < nums.length/2; i++){
            list.add(nums[i]+nums[end]);
            end--;
        }
        return Collections.max(list);
    }
}