class Solution {
    public int lengthOfLastWord(String s) {
        StringBuilder sb = new StringBuilder(s.trim());
        sb.reverse();
        int wordLength = 0;
        for(int i = 0; i < sb.length(); ++i){
            if(sb.charAt(i) != ' '){
                wordLength++;
            }else break;
        }
        return wordLength;
    }
}