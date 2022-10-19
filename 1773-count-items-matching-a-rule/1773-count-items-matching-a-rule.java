class Solution {
    
    public int countMatches(List<List<String>> arr, String ruleKey, String ruleValue) {
        int counter = 0;
        switch(ruleKey){
            case "type":
                for(List<String> item : arr){
                    if(item.get(0).equals(ruleValue)) counter++;
                }
                break;
            case "color":
                for(List<String> item : arr){
                    if(item.get(1).equals(ruleValue)) counter++;
                }
                break;
            case "name":
                for(List<String> item : arr){
                    if(item.get(2).equals(ruleValue)) counter++;
                }
                break;
        }
        return counter;
    }
}