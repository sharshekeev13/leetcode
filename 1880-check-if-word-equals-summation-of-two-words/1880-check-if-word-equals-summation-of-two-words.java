class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        return (Integer.parseInt(getNum(firstWord)) + Integer.parseInt(getNum(secondWord))) == Integer.parseInt(getNum(targetWord));
    }
    
    private String getNum(String word){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < word.length(); i++) {
            int a = (int) word.charAt(i) - 97;
            sb.append(a);
        }
        return sb.toString();
    }
}