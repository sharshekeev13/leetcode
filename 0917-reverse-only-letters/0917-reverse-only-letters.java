class Solution {
    public String reverseOnlyLetters(String s) {
        StringBuilder ss= new StringBuilder(s.replaceAll("[^a-zA-Z]","")).reverse();
        for(int i=0;i<=s.length()-1;i++)
            if(!Character.isLetter(s.charAt(i)))
                ss.insert(i,s.charAt(i));
        return String.valueOf(ss);
    }
}