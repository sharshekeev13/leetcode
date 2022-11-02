class Solution {
    public boolean canBeIncreasing(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            if(isIncreasing(removeTheElement(nums,i))) return true;
        }
        return false;
    }
    
    private boolean isIncreasing(int[] nums){
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > min) min = nums[i];
            else return false;
        }
        return true;
    }
    
     private int[] removeTheElement(int[] arr, int index){
        if (arr == null || index < 0
            || index >= arr.length) {
 
            return arr;
        }
         int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        } 
        return anotherArray;
    }
}