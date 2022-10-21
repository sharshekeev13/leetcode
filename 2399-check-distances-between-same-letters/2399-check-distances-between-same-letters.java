class Solution {
    public boolean checkDistances(String s, int[] distance) {
      int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            if(arr[s.charAt(i) - 'a'] != 0 && i - arr[s.charAt(i) - 'a'] != distance[s.charAt(i) - 'a'])    
                return false;
            arr[s.charAt(i) - 'a'] = i+1;
        }
        return true;
    }
}