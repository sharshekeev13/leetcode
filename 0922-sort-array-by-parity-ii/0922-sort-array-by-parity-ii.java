class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        for(int i = 0; i <nums.length; i++) {
            if(nums[i] % 2 == 0) odd.add(nums[i]);
            else if(nums[i] % 2 != 0) even.add(nums[i]);
        }
        for(int i = 0; i < res.length; i+=2) {
            res[i] = odd.get(0);
            res[i+1] = even.get(0);
            odd.remove(0);
            even.remove(0);
        }
        return res;
    }
    
}