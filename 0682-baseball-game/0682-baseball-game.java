class Solution {
    public int calPoints(String[] arr) {
        List<Integer> record = new ArrayList<>();
        for(int i = 0; i < arr.length; ++i){
            try{
                int num = Integer.parseInt(arr[i]);
                record.add(num);
            }catch(NumberFormatException e){
                if(arr[i].equals("C")) record.remove(record.size() - 1);
                else if(arr[i].equals("D")) record.add(record.get(record.size() - 1)*2);
                else if(arr[i].equals("+")) record.add(record.get(record.size() - 1) + record.get(record.size() - 2));
            }
        }
        int sum = 0;
        for (int x : record){
            sum += x;
        }
        return sum;
    }
}