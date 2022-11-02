class Solution {
    public int minMutation(String start, String end, String[] bank) {
        int level = 0,  len = bank.length;
        char[] chr = {'A','C','G','T'}; // THIS ARRAY WILL BE USED TO GENERATE POSSIBLE MUTATIONS
        
        Set<String> hset = new HashSet<String>(); // TO STORE ALL VALID MUTATIONS
        
        for(String s : bank) hset.add(s);
        
        Queue<String> queue = new LinkedList<>(); // FOR IMPLEMENTING BFS
        queue.add(start);
        
        while(true){
            ++level;
            int n = queue.size();

            if(n == 0 ) return -1; // NO GENE STRING LEFT TO GENERATE ANY OTHER MUTATION 
            
            for(int i=0;i<n;i++){
                char[] ch = queue.poll().toCharArray();
            
                
                for(int j=0;j<8;j++){                  // HERE WE WILL CHECK EVERY LETTER OF GENE STRING
                    char org_char = ch[j];
                    for(int c =0 ; c<4;c++){           // TRYING ALL POSSIBLE MUTATION WITH THE GIVEN GENE STRING
                        ch[j] = chr[c];
                        String str = String.valueOf(ch);
                        if(str.equals(end) && hset.contains(str)) // RETURN IF END GENE IS FOUND AND IS VALID 
                            return (level);
                        if(hset.contains(str) == false) 
                            continue;
                        hset.remove(str);
                        queue.add(str);
                    }
                    ch[j]= org_char;
                }
            }
        }
    }
}