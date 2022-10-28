class Solution {
    public String reformat(String s) {
        StringBuilder result = new StringBuilder();
        List<Character> numbers = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        for(char c : s.toCharArray()) {
            if((int)c > 47 && (int)c < 58) numbers.add(c);
            if((int)c > 96 && (int)c < 123) letters.add(c);
        }
        int between = numbers.size() - letters.size();
        if(between != 0 && between != 1 && between != -1) return "";
        if(letters.size() > numbers.size()){
            for(int i = 0; i < letters.size(); i++){
                result.append(letters.get(i));
                if(letters.size() - 1 == i){
                    break;
                }else{
                    result.append(numbers.get(i));
                }
            }
        }else if(letters.size() < numbers.size()){
            for(int i = 0; i < numbers.size(); i++){
                result.append(numbers.get(i));
                if(numbers.size() - 1 == i){
                    break;
                }else{
                    result.append(letters.get(i));
                }
            }
        }else {
            for(int i = 0; i < numbers.size(); i++){
                result.append(numbers.get(i));
                result.append(letters.get(i));
            }
        }
        return result.toString();
    }
}