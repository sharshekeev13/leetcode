class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuffer str = new StringBuffer(s);
        while(str.indexOf(part) != -1){
            if(str.indexOf(part) != -1){
                str.delete(str.indexOf(part),str.indexOf(part)+part.length());
            }
        }
        return str.toString();
    }
}