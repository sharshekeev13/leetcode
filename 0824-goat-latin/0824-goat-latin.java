class Solution {
    public String toGoatLatin(String sentence) {
        String vowels = "aeiouAEIOU";
        String wordEnds = "a";
        String ma = "ma";
        String[] words = sentence.split(" ");
        for(int i = 0; i < words.length; i++) {
            if(vowels.indexOf(words[i].charAt(0)) != -1){
                words[i] = words[i]+ma+wordEnds;
                wordEnds = wordEnds + "a";
            }else{
                char f = words[i].charAt(0);
                String w = words[i].substring(1,words[i].length());
                words[i] = w + f + ma +wordEnds;
                wordEnds = wordEnds+"a";
            }
        }
        return String.join(" ",words);
    }
}