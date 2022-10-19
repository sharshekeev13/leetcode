class Solution {
    public int[] shuffle(int[] nums, int n) {
        List<Integer> result = new ArrayList<>();
        int secondHalf = n;
        for(int i = 0; i < n; i++){
            result.add(nums[i]);
            result.add(nums[secondHalf]);
            secondHalf++;
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}