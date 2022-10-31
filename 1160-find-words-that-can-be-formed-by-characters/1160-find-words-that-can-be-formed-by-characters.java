class Solution {
    public int countCharacters(String[] words, String chars) {
        int res = 0;
        for(String word : words){
            if(checkWord(word,chars)) res+=word.length();
        }
        return res;
    }
    
    private boolean checkWord(String word, String chars) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : chars.toCharArray()) {
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        for(char c : word.toCharArray()) {
            if(!map.containsKey(c)) return false;
            else{
                map.put(c,map.get(c)-1);
            }
        }
        for(char key : map.keySet()) {
            if(map.get(key) < 0) return false;
        }
        return true;
    }
}