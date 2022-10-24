class Solution {
    public String reverseWords(String s) {
        String[] sArray = s.split(" ");
        for(int i = 0; i < sArray.length; i++) {
            sArray[i] = new StringBuilder(sArray[i]).reverse().toString();
        }
        return String.join(" ",sArray);
    }
}