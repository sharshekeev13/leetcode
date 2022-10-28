class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k) return false;
        HashMap<Character,Integer> letters = new HashMap<>();
        for(char c : s.toCharArray()) {
            if(letters.containsKey(c)) letters.put(c,letters.get(c)+1);
            else letters.put(c,1);
        }
        int oddCounter = 0;
        for(char ch : letters.keySet()){
            if(letters.get(ch) % 2 != 0) oddCounter++;
        }
        return oddCounter > k ? false : true;
    }
}