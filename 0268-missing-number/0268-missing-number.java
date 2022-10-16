class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        for(int i : nums){
            result.add(i);
        }
        for(int i = 0; i <= result.size(); ++i){
            if(!result.contains(i)){
                return i;
            }
        }
        return -1;
    }
}