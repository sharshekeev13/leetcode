class Solution {
    public boolean findSubarrays(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int counter = 0;
        for(int i = 0; i < nums.length-1; i++){
            map.put(counter++,nums[i]+nums[i+1]);
        }
        return new HashSet<>(map.values()).size() != map.size();
    }
}