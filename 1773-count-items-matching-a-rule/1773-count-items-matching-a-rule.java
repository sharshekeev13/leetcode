class Solution {
    
    public int countMatches(List<List<String>> arr, String ruleKey, String ruleValue) {
        int counter = 0;
        byte rule = 0;
        if(ruleKey.equals("color")) rule = 1;
        if(ruleKey.equals("name")) rule = 2;
        for(List<String> item : arr){
            if(item.get(rule).equals(ruleValue)) counter++;
        }
        return counter;
    }
}