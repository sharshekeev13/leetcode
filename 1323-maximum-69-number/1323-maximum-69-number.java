class Solution {
    public int maximum69Number (int num) {
        int max = num;
        int length = (int) (Math.log10(num) + 1);
        for(int i = 0; i < length; i++) {
            int[] arr = Integer.toString(num).chars().map(c -> c-'0').toArray();
            if(arr[i] == 6){
                arr[i] = 9;
                StringBuilder s = new StringBuilder(); 
                for (int j : arr){
                     s.append(j);
                }
                int arrNum = Integer.parseInt(s.toString());
                if(arrNum > max) max = arrNum;
            }else{
                arr[i] = 6;
                StringBuilder s = new StringBuilder(); 
                for (int j : arr){
                     s.append(j);
                }
                int arrNum = Integer.parseInt(s.toString());
                if(arrNum > max) max = arrNum;
            }
        }
        return max;
    }
}