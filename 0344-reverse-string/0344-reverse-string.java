class Solution {
    public void reverseString(char[] s) {
        int endOfString = s.length - 1;
        char current = 'a';
        for(int i = 0; i < s.length/2; ++i){
            current = s[i];
            s[i] = s[endOfString];
            s[endOfString] = current;
            endOfString--;
        }
    }
}