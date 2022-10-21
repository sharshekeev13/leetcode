class Solution {
    public int numberOfSteps(int num) {
        int counter = 0;
        int number = num;
        while(number > 0) {
            if(number % 2 == 0){
                counter++;
                number/=2;
            }else{
                counter++;
                number-=1;
            }
        }
        return counter;
    }
}