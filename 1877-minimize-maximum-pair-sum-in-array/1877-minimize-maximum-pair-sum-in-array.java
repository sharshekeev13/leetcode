class Solution {
    public int minPairSum(int[] A) {
        Arrays.sort(A);
        int res = 0, n = A.length;
        for (int i = 0; i < n / 2; ++i)
            res = Math.max(res, A[i] + A[n - i - 1]);
        return res;
    }
}