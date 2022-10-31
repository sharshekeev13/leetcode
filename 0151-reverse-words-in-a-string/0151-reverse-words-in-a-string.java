class Solution {
    public String reverseWords(String s) {
        s = s.replaceAll("[\\s]{2,}", " ").trim();
        String[] result = s.split(" ");
        int endIndex = result.length-1;
        for(int i = 0; i < result.length/2; i++){
            String prev = result[i];
            result[i] = result[endIndex];
            result[endIndex] = prev;
            endIndex--;
        }
        return String.join(" ",result);
    }
}