class Solution {
    
    public int countMatches(List<List<String>> arr, String ruleKey, String ruleValue) {
        byte rule = 0;
        switch(ruleKey){
            case "type":
                rule = 0;
                break;
            case "color":
                rule = 1;
                break;
            case "name":
                rule = 2;
                break;
        }
        int counter = 0;
        for(int i = 0; i < arr.size(); i++){
            List<String> item = arr.get(i);
            if(item.get(rule).equals(ruleValue)) counter++;
        }
        return counter;
    }
}