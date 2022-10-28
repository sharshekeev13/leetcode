class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] tokens = text.split(" ");
        int n = tokens.length;
        List<String> res = new ArrayList<>();
        
        for(int i=0;i<n;i++) {
            if(tokens[i].equals(first)) {
                if(i+1<n && tokens[i+1].equals(second) && i+2<n)
                    res.add(tokens[i+2]);
                    
            }
        }
        return res.toArray(new String[res.size()]);
    }
}