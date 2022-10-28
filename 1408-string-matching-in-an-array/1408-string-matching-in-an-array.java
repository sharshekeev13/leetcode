class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> result = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(!words[i].equals(words[j]) && words[i].indexOf(words[j]) != -1){
                    if(!result.contains(words[j])) result.add(words[j]);
                }
            }
        }
        return result;
    }
}