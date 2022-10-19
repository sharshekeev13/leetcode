class Solution {
    public int findSpecialInteger(int[] arr) {
        int percent = (int)(arr.length*(25.0f/100.0f));
        HashMap<Integer,Integer> result = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(result.containsKey(arr[i])){
                result.put(arr[i],result.get(arr[i])+1);
            }else{
                result.put(arr[i],1);
            }
        }
        for(int key : result.keySet()){
            if(result.get(key) > percent) return key;
        }
        return 0;
    }
}