class Solution {
    public boolean areNumbersAscending(String s) {
        int prev = 0;
        String[] numberOnly= s.replaceAll("[^0-9]", " ").split(" ");
        for(String str : numberOnly) {
            if(!str.equals("")){
                if(Integer.parseInt(str) <= prev) return false;
                else prev = Integer.parseInt(str);
            }
        }
        return true;
    }
}