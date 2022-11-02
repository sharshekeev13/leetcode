class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int i = left; i <= right; i++){
            String temp = Integer.toString(i);
            boolean isDivide = true;
            for(int j = 0; j < temp.length(); j++){
                if((temp.charAt(j)-'0') == 0 || i % (temp.charAt(j)-'0') !=0) isDivide = false;
            }
            if(isDivide) result.add(i);
        }
        return result;
    }
}