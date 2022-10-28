class Solution {
    
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>> output = new ArrayList<List<String>>();
        Map<String, List<String>> hashmap= new HashMap<String, List<String>>();
        List<String> sortedStrings = new ArrayList<>();
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sorted = String.valueOf(charArray);
            if(hashmap.containsKey(sorted)){
                List<String> temp1 = hashmap.get(sorted);
                temp1.add(str);
                hashmap.put(sorted,temp1);
            }
            else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                hashmap.put(sorted, temp);
            }
        }
        return new ArrayList<>( hashmap.values());
    }
}