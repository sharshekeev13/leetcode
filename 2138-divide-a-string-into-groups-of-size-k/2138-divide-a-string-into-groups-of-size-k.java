class Solution {
    public String[] divideString(String s, int k, char fill) {
        StringBuilder str =  new StringBuilder(s);
        List<String> result = new ArrayList<>();
        while(str.length() >= k){
            if(str.length() >= k){
                StringBuilder t = new StringBuilder();
                for(int i = 0; i < k; i++){
                    t.append(str.charAt(i));
                }
                result.add(t.toString());
                str.delete(0,k);
            }
        }
        if(str.length() != 0){
            while(str.length() != k){
            str.append(fill);
            }
            result.add(str.toString());
        }       
        return result.toArray(new String[result.size()]);
    }
}