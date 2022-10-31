class Solution {
    public String generateTheString(int n) {
        StringBuilder result = new StringBuilder();
        if(n%2 != 0){
            for(int i = 0; i < n; i++){
                result.append("a");
            }
        }else{
            for(int i = 0; i < n-1; i++){
                result.append("a");
            }
            result.append("b");
        }
        return result.toString();
    }
}