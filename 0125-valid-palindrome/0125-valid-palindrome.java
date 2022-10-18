class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder(s.toLowerCase().replaceAll("[^a-z0-9]+", ""));
        return result.toString().equals(result.reverse().toString());
    }
}