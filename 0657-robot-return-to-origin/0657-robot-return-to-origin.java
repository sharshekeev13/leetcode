class Solution {
    public boolean judgeCircle(String str) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == 'U') y++;
            else if(str.charAt(i) == 'R') x++;
            else if(str.charAt(i) == 'D') y--;
            else if(str.charAt(i) == 'L') x--;
        }
        return x==0 && y==0;
    }
}