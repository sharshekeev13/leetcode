class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0; i+m < nums1.length; i++){
            nums1[i+m] = nums2[i];
        }
        Arrays.sort(nums1);
    }
}