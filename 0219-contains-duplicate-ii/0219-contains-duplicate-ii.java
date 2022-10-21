class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!hMap.containsKey(nums[i])){
                hMap.put(nums[i],i);
            }else{
                if(i - hMap.get(nums[i]) <= k) return true;
                hMap.remove(nums[i]);
                hMap.put(nums[i],i);
            }
        }
        return false;
    }
}