class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for(String s : operations){
            if(s.indexOf("-") != (-1)) result--;
            else if(s.indexOf("+") != (-1)) result++;
        }
        return result;
    }
}