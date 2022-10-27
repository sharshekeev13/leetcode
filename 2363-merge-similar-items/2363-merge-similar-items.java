class ListComparator<T extends Comparable<T>> implements Comparator<List<T>> {

  @Override
  public int compare(List<T> o1, List<T> o2) {
    for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
      int c = o1.get(i).compareTo(o2.get(i));
      if (c != 0) {
        return c;
      }
    }
    return Integer.compare(o1.size(), o2.size());
  }

}


class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        HashMap<Integer,Integer> numbers = new HashMap<>();
        for(int i = 0; i < items1.length; i++){
            if(!numbers.containsKey(items1[i][0])) numbers.put(items1[i][0],items1[i][1]);
            else numbers.put(items1[i][0],numbers.get(items1[i][0]));
        }
        for(int i = 0; i < items2.length; i++){
            if(!numbers.containsKey(items2[i][0])) numbers.put(items2[i][0],items2[i][1]);
            else numbers.put(items2[i][0],numbers.get(items2[i][0])+items2[i][1]);
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int key : numbers.keySet()){
            List<Integer> arr = new ArrayList<>();
            arr.add(key);
            arr.add(numbers.get(key));
            res.add(arr);
        }
        Collections.sort(res, new ListComparator<>());
        return res;
    }
}