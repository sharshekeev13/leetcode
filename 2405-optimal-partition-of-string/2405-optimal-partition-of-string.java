class Solution {
    public int partitionString(String s) {
        int counter = 1;
        String[] arr = s.split("");
        StringBuilder sb = new StringBuilder();
        for(String c : arr){
            if(sb.indexOf(c) == -1) sb.append(c);
            else{
                counter++;
                sb.setLength(0);
                sb.append(c);
            }
        }
        return counter;
    }
}