class Solution {
    public List<String> fizzBuzz(int n) {
        HashMap<Integer,String> result = new HashMap<>(); 
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                result.put(i,"FizzBuzz");
            }else if(i % 3 == 0){
                result.put(i,"Fizz");
            }else if(i % 5 == 0){
                result.put(i,"Buzz");
            }else{
                result.put(i,String.valueOf(i));
            }
        }
        ArrayList<String> values = new ArrayList<>(result.values());
        return values;
    }
}