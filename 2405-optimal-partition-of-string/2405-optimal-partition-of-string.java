class Solution {
    public int partitionString(String s) {
        int counter = 1;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(sb.indexOf(String.valueOf(c)) == -1) sb.append(c);
            else{
                counter++;
                sb.setLength(0);
                sb.append(c);
            }
        }
        return counter;
    }
}