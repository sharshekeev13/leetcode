class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String, Integer> words = new HashMap<>();
        String[] s1Arr = s1.split(" ");
        String[] s2Arr = s2.split(" ");
        for(String i : s1Arr){
            if(words.containsKey(i)) words.put(i,words.get(i)+1);
            else words.put(i,1);
        }
        for(String j : s2Arr){
            if(words.containsKey(j)) words.put(j,words.get(j)+1);
            else words.put(j,1);
        }
        List<String> result = new ArrayList<>();
        for(String key : words.keySet()){
            if(words.get(key) == 1) result.add(key);
        }
        return result.toArray(new String[result.size()]);
    }
}