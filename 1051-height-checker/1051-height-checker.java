class Solution {
    public int heightChecker(int[] heights) {
        int[] sortedHeights = new int[heights.length];
        for(int i = 0; i < sortedHeights.length; i++) {
            sortedHeights[i] = heights[i];
        }
        Arrays.sort(sortedHeights);
        int counter = 0;
        for(int i = 0; i < heights.length; i++){
            if(sortedHeights[i] != heights[i]) counter++;
        }
        return counter;
    }
}