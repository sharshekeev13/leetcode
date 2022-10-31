class Solution {
    public int countSegments(String s) {
        s = s.replaceAll("[\\s]{2,}", " ").trim();
        if(s.length() == 0) return 0;
        String[] result = s.split(" ");
        return result.length;
    }
}