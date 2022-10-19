class Solution {
    
    public int countMatches(List<List<String>> arr, String ruleKey, String ruleValue) {
        HashMap<String,Integer> rules = new HashMap<>();
        rules.put("type",0);
        rules.put("color",1);
        rules.put("name",2);
        int counter = 0;
        for(int i = 0; i < arr.size(); i++){
            List<String> item = arr.get(i);
            if(item.get(rules.get(ruleKey)).equals(ruleValue)) counter++;
        }
        return counter;
    }
}