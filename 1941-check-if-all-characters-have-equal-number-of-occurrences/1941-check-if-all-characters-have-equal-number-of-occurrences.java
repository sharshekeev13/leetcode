class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }
        int a = map.get(s.charAt(0));
        for(char key : map.keySet()) {
            if(map.get(key) != a) return false;
        }
        return true;
    }
}