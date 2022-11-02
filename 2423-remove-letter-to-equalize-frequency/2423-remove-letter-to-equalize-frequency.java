class Solution {
    public boolean equalFrequency(String word) {
        for(int i = 0; i < word.length(); i++) {
            StringBuilder sb = new StringBuilder(word);
            if(checkWord(sb.deleteCharAt(i).toString())) return true;
        }
        return false;
    }
    
    
    
    
    private boolean checkWord(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        int first = map.get(str.charAt(0));
        for(char key : map.keySet()){
            if(map.get(key) != first) return false;
        }
        return true;
    }
}