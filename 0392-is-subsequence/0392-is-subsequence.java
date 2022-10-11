class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() <= 0) return true;
        StringBuilder result = new StringBuilder(s);
        StringBuilder tb = new StringBuilder(t);
        for (int i = 0; i < t.length(); i++){
            if (result.toString().length() == 0) return true;
            if(result.charAt(0) == tb.charAt(i)){
               result.deleteCharAt(0);   
            }
        }
        return result.toString().length() == 0;
    }
}