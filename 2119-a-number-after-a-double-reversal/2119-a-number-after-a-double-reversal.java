class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = Integer.parseInt(new StringBuilder(String.valueOf(num)).reverse().toString());
        return Integer.parseInt(new StringBuilder(String.valueOf(n)).reverse().toString()) == num ? true : false;
    }
}