class Solution {
    public int balancedStringSplit(String s) {
        int res = 0;
        int balance = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'L') balance++;
            else if(s.charAt(i) == 'R') balance--;
            if(balance == 0){
                res++;
            }
        }
        return res;
    }
}