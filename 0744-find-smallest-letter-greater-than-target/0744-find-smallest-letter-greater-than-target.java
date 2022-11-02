class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char smallest = (char) 255;
        for(char c : letters){
            if(target < c && c < smallest) smallest = c;
        }
        return smallest == 255 ? letters[0] : smallest;
    }
}