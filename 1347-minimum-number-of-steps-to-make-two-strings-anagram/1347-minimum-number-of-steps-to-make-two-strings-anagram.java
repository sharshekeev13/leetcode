class Solution {
    public int minSteps(String s, String t) {
            int[] alpha = new int[26];
			int steps = 0;
        
			for(int i = 0; i < s.length(); i++){
            
				alpha[s.charAt(i) - 'a']++;
				alpha[t.charAt(i) - 'a']--;
			}
        
			for(int n: alpha)
				if(n > 0) steps += n;
        
			return steps;
    }
}