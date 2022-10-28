class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int counter = 0;
        for(String word : words){
            if(checkWord(word,allowed)) counter++; 
        }
        return counter;
    }
    
    private boolean checkWord(String str, String allowed){
        for(char c : str.toCharArray()){
            if(allowed.indexOf(c) == -1) return false;
        }
        return true;
    }
}