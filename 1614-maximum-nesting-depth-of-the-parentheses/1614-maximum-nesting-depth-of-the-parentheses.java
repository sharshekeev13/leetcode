class Solution {
    public int maxDepth(String s) {
        int result = 0;
        int counter = 0;
        for(char c : s.toCharArray()){
            if(c == '(') counter++;
            if(c == ')'){
                if(counter>result) result = counter;
                counter--;
            }
        }
        return result;
    }
}