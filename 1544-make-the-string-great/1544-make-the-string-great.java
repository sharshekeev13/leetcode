class Solution {
    public String makeGood(String s) {
        StringBuilder ss = new StringBuilder(s);
        for (int i = 0; i <= ss.length() - 2; i++)
            if (ss.codePointAt(i)+32 == ss.codePointAt(i + 1) || ss.codePointAt(i)-32 == ss.codePointAt(i + 1)) {
                ss.delete(i, i + 2);
                i =- 1;
            }
        return ss.toString();
    }
}