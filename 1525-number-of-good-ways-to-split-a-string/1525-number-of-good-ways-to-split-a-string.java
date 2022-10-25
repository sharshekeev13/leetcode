class Solution {
    public int numSplits(String s) {
       HashMap<Character,Integer>hm1=new HashMap<>();
        HashMap<Character,Integer>hm2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(hm1.containsKey(s.charAt(i))==false){
                hm1.put(s.charAt(i),1);
            }else{
                hm1.put(s.charAt(i),hm1.get(s.charAt(i))+1);
            }
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            if(hm2.containsKey(s.charAt(i))==false){
                hm2.put(s.charAt(i),1);
            }else{
                 hm2.put(s.charAt(i),hm2.get(s.charAt(i))+1);
            }
            hm1.put(s.charAt(i),hm1.get(s.charAt(i))-1);
            if(hm1.get(s.charAt(i))==0){
                hm1.remove(s.charAt(i));
            }

            if(hm1.size()==hm2.size()){
                count++;
            }
        }
        return count;
    }
}