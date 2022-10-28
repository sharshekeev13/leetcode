class Solution {
    public int countGoodSubstrings(String s) {
       int count=0;

        for(int i=0;i<s.length()-2;i++){

            char x=s.charAt(i);
            char y=s.charAt(i+1);
            char z=s.charAt(i+2);

            if(x!=y && y!=z && z!=x) count++;

        }
        
        return count;
        
    }
}