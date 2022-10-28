class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '*'){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        String result = stack.toString().replace("[", "").replace("]","").replaceAll(",","").replaceAll(" ","");
        return result.toString();
    }
}