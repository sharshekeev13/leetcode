class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums1.length; ++i){
            for(int j = 0; j < nums2.length; ++j){
                if(nums1[i] == nums2[j]){
                    if(!result.contains(nums1[i])){
                        result.add(nums1[i]);
                    }
                }
            }
        }
        return result.stream().mapToInt(i -> i).toArray();
    }
}