class Solution {
    public String firstPalindrome(String[] words) {
        for(String word : words){
            if(word.equals(new StringBuilder(word).reverse().toString())) return word;
        }
        return "";
    }
}