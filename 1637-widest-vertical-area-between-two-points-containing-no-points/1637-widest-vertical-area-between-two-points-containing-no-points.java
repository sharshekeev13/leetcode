class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> b[0] - a[0]);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < points.length - 1; i++)
            max = Math.max(max, points[i][0] - points[i + 1][0]);
        return max;
    }
}