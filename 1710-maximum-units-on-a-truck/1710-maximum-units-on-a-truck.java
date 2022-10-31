class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        int ts = 0;
        int units = 0;
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        for(int i = 0; i < boxTypes.length; i++) {
            if(ts != truckSize){
                    for(int j = 0; j < boxTypes[i][0]; j++){
                    units+=boxTypes[i][1];
                    ts++;
                    if(ts == truckSize) return units;
                }
            }else break;
        }
        return units;
    }
}