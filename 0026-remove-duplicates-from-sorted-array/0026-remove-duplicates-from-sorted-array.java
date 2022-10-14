class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(nums[0]);
        int index = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[index] != nums[i]){
                index++;
                nums[index] = nums[i];
                result.add(nums[i]);
            }
        }
        for(int i:nums){
            System.out.println(i);
        }
        return result.size();
    }
}