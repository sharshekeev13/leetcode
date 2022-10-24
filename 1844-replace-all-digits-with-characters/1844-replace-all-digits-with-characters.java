class Solution {
    public String replaceDigits(String s) {
        char[] sChar = s.toCharArray();
        for(int i = 1; i < sChar.length; i+=2){
            sChar[i] = (char) (sChar[i-1] + Integer.parseInt(String.valueOf(sChar[i])));
        }
        return String.valueOf(sChar);
    }
}