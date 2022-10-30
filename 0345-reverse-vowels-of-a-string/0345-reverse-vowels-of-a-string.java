class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAUIOE";
        int start = 0;
        int end = s.length() - 1;
        char[] sChar = s.toCharArray();
        while(start < end){
            if(vowels.indexOf(sChar[start]) != -1 && vowels.indexOf(sChar[end]) != -1){
                char prev = sChar[start];
                sChar[start] = sChar[end];
                sChar[end] = prev;
                start++;
                end--;
            }else if(vowels.indexOf(sChar[start]) == -1 && vowels.indexOf(sChar[end]) != -1){
                start++;   
            }else if(vowels.indexOf(sChar[start]) != -1 && vowels.indexOf(sChar[end]) == -1){
                end--;
            }else if(vowels.indexOf(sChar[start]) == -1 && vowels.indexOf(sChar[end]) == -1){
                start++;
                end--;
            }
        }
        return String.valueOf(sChar);
    }
}