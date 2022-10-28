class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int width = 100;
        int lineWidth = 0;
        int lineCounter = 0;
        for(char c : s.toCharArray()){
            int letterWidth = widths[(int)c - 97];
            if(lineWidth+letterWidth > 100){
                System.out.println();
                lineCounter++;
                lineWidth=0;
            }
            System.out.print(c);
            lineWidth+=letterWidth;
        }
        return new int[]{lineCounter+1,lineWidth};
    }
}