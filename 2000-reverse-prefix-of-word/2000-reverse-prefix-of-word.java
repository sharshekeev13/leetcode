class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ch){
                result.append(new StringBuilder(word.substring(0,i+1)).reverse().toString());
                result.append(word.substring(i+1,word.length()));
                return result.toString();
            }
        }
        return word;
    }
}