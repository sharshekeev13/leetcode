class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> result = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                pos.add(nums[i]);
            }else{
                neg.add(nums[i]);
            }
        }
        for(int i = 0; i < nums.length/2; i++){
            result.add(pos.get(i));
            result.add(neg.get(i));
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}