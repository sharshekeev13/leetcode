class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> count = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(!count.containsKey(s.charAt(i))) count.put(s.charAt(i),1);
            else{
                count.put(s.charAt(i),count.get(s.charAt(i))+1);
                if(count.get(s.charAt(i)) == 2) return s.charAt(i);
            }
        }
        return ' ';
    }
}