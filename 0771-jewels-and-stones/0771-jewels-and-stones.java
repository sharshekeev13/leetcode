class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int counter = 0;
        for(int i = 0; i < stones.length(); i++){
            if(jewels.indexOf(String.valueOf(stones.charAt(i))) != (-1)) counter++;
        }
        return counter;
    }
}