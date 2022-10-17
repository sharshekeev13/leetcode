class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> arr = new HashMap<>();
        int ans = 0;
        for(int num : nums){
            if(arr.containsKey(num)){
                ans = num;
                break;
            }
            else {
                arr.put(num,num);
            }
        }
        return ans;
    }
}