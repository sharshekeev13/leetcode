class Solution {
    public String truncateSentence(String s, int k) {
        int spaceCounter = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') spaceCounter++;
            if(spaceCounter == k){
                s = s.substring(0,i);
            }
        }
        return s;
    }
}