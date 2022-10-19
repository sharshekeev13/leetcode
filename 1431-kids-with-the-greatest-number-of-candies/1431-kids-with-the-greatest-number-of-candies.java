class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] result = new Boolean[candies.length];
        for(int i = 0; i < candies.length; i++) {
            for(int j = 0; j < candies.length; j++) {
                if(candies[i] + extraCandies < candies[j]) {
                    result[i] = false;
                    break;
                }else{
                    result[i] = true;
                }
            }
        }
        return Arrays.asList(result);
    }
}