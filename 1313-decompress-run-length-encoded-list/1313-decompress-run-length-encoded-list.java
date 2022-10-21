class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i+=2) {
            for(int j = 0; j < nums[i]; j++){
                res.add(nums[i+1]);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}