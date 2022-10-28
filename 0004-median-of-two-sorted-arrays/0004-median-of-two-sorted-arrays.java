class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int fal = nums1.length;        
        int sal = nums2.length;  
        int[] result = new int[fal + sal];   
        System.arraycopy(nums1, 0, result, 0, fal);  
        System.arraycopy(nums2, 0, result, fal, sal);
        Arrays.sort(result);
        double median;
        if (result.length % 2 == 0)
            median = ((double)result[result.length/2] + (double)result[result.length/2 - 1])/2;
        else
            median = (double) result[result.length/2];
        return median;
    }
}