class Solution {
    public boolean checkIfPangram(String str) {
        HashSet<Character> chars = new HashSet<>();
        for(int i = 0; i < str.length(); ++i){
            if(!chars.contains(str.charAt(i))) chars.add(str.charAt(i));
        }
        return chars.size() == 26;
    }
}