class Solution {
    public int findComplement(int num) {
        String b = Integer.toBinaryString(num);
        char[] r = b.toCharArray();
        for(int i = 0; i < r.length; i++) {
            if (r[i] == '1') r[i] = '0';
            else r[i] = '1';
        }
        return Integer.parseInt(String.valueOf(r), 2);
    }
}