class Solution {
    public String breakPalindrome(String palindrome) {
       int n = palindrome.length();
       if(n <= 1){
            return "";
        }
        StringBuilder string = new StringBuilder(palindrome);     
        for(int i=0;i<n/2;i++){
            if(string.charAt(i) != 'a'){
                string.setCharAt(i,'a') ;
                return string.toString();
            }
        }
        string.setCharAt(n-1,'b') ;
        palindrome = string.toString();
        return palindrome;
    }
}