class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int result = 0;
        for(int i = piles.length-2; i >= 0; i-=2){
            if(i < piles.length/3) break;
            result+=piles[i];
        }
        return result;
    }
}