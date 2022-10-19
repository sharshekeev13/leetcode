class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int num : nums){
            if(!result.containsKey(num)) result.put(num,1);
            else {
                result.put(num,result.get(num)+1);
            }
        }
        int sum = 0;
        for(int key:result.keySet()){
            if(result.get(key) == 1) sum+=key;
        }
        return sum;
    }
}