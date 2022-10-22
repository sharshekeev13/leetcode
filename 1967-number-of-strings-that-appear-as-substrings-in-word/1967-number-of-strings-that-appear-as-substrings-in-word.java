class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int counter = 0;
        for(String p : patterns) {
            if(word.indexOf(p) != (-1)) counter++;
        }
        return counter;
    }
}