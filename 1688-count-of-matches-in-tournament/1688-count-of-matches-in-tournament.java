class Solution {
    public int numberOfMatches(int n) {
        int counter = 0;
        int teams = n;
        while(teams > 1){
            if(teams % 2 == 0){
                counter = counter + teams/2;
                teams/=2;
            }else{
                counter = counter + ((teams - 1) / 2);
                teams = ((teams - 1) / 2 + 1);
            }
        }
        return counter;
    }
}