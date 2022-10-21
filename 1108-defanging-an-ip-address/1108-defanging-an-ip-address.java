class Solution {
    public String defangIPaddr(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '.') sb.append("[.]");
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}