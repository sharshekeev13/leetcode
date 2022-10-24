class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        String[] sArray = s.split(" ");
        for(String word : sArray) {
            StringBuilder builder = new StringBuilder(word);
            result.append(builder.reverse().toString());
            result.append(" ");
        }
        return result.toString().trim();
    }
}