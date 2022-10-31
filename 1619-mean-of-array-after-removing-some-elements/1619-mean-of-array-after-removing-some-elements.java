class Solution {
    public double trimMean(int[] arr) {
         double n = arr.length ;        
        double per = n * 0.05 ;
        Arrays.sort(arr) ;
        double sum = 0 ;
        for(double i = per  ; i < n - per ; i++){
            int val  = (int)i ;
            sum = sum + arr[val] ;
        }
          double ans = sum ;
        ans = ans /(n - 2*per ) ;
        return ans ;
    }
}