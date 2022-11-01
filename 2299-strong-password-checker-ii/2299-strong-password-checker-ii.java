class Solution {
    public boolean strongPasswordCheckerII(String str) {
        if(str.length() < 8) return false;
        boolean lowercase = false, uppercase = false, digit = false, specialCharacter = false, sameChar = true;
        String sc = "!@#$%^&*()-+";
        for(int i = 0 ; i < str.length(); i++){
            if(Character.isLowerCase(str.charAt(i))) lowercase = true;
            else if (Character.isUpperCase(str.charAt(i))) uppercase = true;
            else if (Character.isDigit(str.charAt(i))) digit = true;
            else if (sc.indexOf(String.valueOf(str.charAt(i))) != -1) specialCharacter = true;
            if(i != 0){
                if (str.charAt(i) == str.charAt(i-1)) sameChar = false;
            }
        }
        return lowercase && uppercase && digit && specialCharacter && sameChar;
    }
    
}