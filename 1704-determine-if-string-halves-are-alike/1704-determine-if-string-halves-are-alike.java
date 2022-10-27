class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2, s.length());
        int aNum = 0;
        int bNum = 0;
        for(int i = 0; i < s.length()/2; i++) {
            if(check(a.charAt(i))) aNum++;
            if(check(b.charAt(i))) bNum++;
        }
        return aNum == bNum;
    }
    
    
    public static boolean check(char c) {
        return "aeiou".indexOf(String.valueOf(c).toLowerCase()) > -1;
    }
}