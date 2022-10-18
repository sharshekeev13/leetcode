class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int len = arr.length;
        int sum = 0;
        
        for(int i = 0; i < len; i+=2){
            for(int j = 0; j < len; j++){
                if(i+j < len) {
                    for(int k = 0; k <= i; k++) {
                        sum += arr[j+k];
                    }
                }
            }
        }
        return sum;
    }
}