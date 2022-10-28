class Solution {
    public int maxPower(String s) {
        int ans = 1;
        for (int i = 1, cnt = 1; i < s.length(); ++i) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                if (++cnt > ans) {
                    ans = cnt;
                }
            }else {
                cnt = 1;
            }
        }
        return ans;
    }
}