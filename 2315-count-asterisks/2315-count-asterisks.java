class Solution {
    public int countAsterisks(String s) {
        boolean flag = true;
        int count = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == '*' && flag){
                count += 1;
                continue;
            }
            if(ch == '|') flag = !flag;
        }
        return count;
    }
}