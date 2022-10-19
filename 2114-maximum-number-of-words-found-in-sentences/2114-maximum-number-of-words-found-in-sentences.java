class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;
        for(String str : sentences){
            String[] arr = str.split(" ");
            if(arr.length > maxLength) maxLength = arr.length;
        }
        return maxLength;
    }
}