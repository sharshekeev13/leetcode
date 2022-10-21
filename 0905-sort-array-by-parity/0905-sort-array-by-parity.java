class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] % 2 == 0){
                odd.add(nums[i]);
            }else {
                even.add(nums[i]);
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < odd.size(); i++) {
            result.add(odd.get(i));
        }
        for(int i = 0; i < even.size(); i++) {
            result.add(even.get(i));
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}