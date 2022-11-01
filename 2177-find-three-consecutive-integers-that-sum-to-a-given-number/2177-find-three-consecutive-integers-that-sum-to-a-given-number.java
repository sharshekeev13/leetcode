class Solution {
    public long[] sumOfThree(long num) {
        if(num % 3 == 0){
            long[] res = new long[3];
            res[1] = num/3;
            res[0] = res[1]-1;
            res[2] = res[1]+1;
            return res;
        }else return new long[0];
    }
}