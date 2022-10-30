class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ransomMap = new HashMap<>();
        HashMap<Character,Integer> magazineMap = new HashMap<>();
        for(char c : ransomNote.toCharArray()) {
            if(ransomMap.containsKey(c)) ransomMap.put(c,ransomMap.get(c)+1);
            else ransomMap.put(c,1);
        }
        for(char c : magazine.toCharArray()) {
            if(magazineMap.containsKey(c)) magazineMap.put(c,magazineMap.get(c)+1);
            else magazineMap.put(c,1);
        }
        for(char key : ransomMap.keySet()) {
            if(!magazineMap.containsKey(key)) return false;
            else{
                if(magazineMap.get(key) < ransomMap.get(key)) return false;
            }
        }
        return true;
    }
}