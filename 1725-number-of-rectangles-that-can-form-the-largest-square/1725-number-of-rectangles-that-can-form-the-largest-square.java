class Solution {
    public int countGoodRectangles(int[][] arr) {
        List<Integer> res = new ArrayList<>();
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i][0] < arr[i][1]){
                res.add(arr[i][0]);
            }else{
                res.add(arr[i][1]);
            }
        }
        Collections.sort(res);
        int max = res.get(res.size() - 1);
        for(Integer num : res){
            if(num == max) count++;
        }
        return count;
    }
}