class Skiplist {
    
    List<Integer> list = new ArrayList<>();

    public Skiplist() {
    }
    
    public boolean search(int target) {
        return list.contains(target);
    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public boolean erase(int num) {
        if(list.contains(num)){
            list.remove(Integer.valueOf(num));
            return true;
        }
        return false;
    }
}

/**
 * Your Skiplist object will be instantiated and called as such:
 * Skiplist obj = new Skiplist();
 * boolean param_1 = obj.search(target);
 * obj.add(num);
 * boolean param_3 = obj.erase(num);
 */