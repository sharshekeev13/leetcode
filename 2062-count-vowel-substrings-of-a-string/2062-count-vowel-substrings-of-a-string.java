class Solution {
    public int countVowelSubstrings(String word) {
        if(word.length() < 5) return 0;
        String vowels = "aeiou";
        int counter = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length()-1; i++){
            if(vowels.indexOf(word.charAt(i)) != -1){
                sb.append(word.charAt(i));
                for(int j = i+1; j < word.length(); j++){
                    if(vowels.indexOf(word.charAt(j)) != -1){
                        sb.append(word.charAt(j));
                        if(sb.length() >= 5 && checkString(sb.toString())) counter++;
                    }else{
                        sb.setLength(0);
                        break;
                    }
                }
                sb.setLength(0);
            }
        }
        return counter;
    }
    
    private boolean checkString(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        String vowels = "aeiou";
        for(char c : s.toCharArray()){
            if(vowels.indexOf(c) != -1){
                map.put(c,1);
            }
        }
        return map.size() == 5;
    }
}