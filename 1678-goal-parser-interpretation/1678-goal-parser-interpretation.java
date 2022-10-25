class Solution {
    public String interpret(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); ++i){
            if(str.charAt(i) == 'G') result.append("G");
            else if(str.charAt(i) == '('){
                if(str.charAt(i+1) == ')'){
                    result.append("o");
                }else{
                    result.append("al");
                }
            }
        }
        return result.toString();
    }
}