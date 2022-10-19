class Solution {
    
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int counter = 0;
        switch(ruleKey){
            case "type":
               for(int i=0; i<items.size(); i++ ){
                    if(items.get(i).get(0).equals(ruleValue)) counter++;
                   }
                break;
            case "color":
                for(int i=0; i<items.size(); i++ ){
                    if(items.get(i).get(1).equals(ruleValue)) counter++;
                   }
                break;
            case "name":
                for(int i=0; i<items.size(); i++ ){
                    if(items.get(i).get(2).equals(ruleValue)) counter++;
                   }
                break;
        }
        return counter;
    }
}