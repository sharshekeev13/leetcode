class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<=s.length()-1;i++)
            ss.append(s.codePointAt(i)-96);
        while(k>0){
            sum=0;
            for (int i=0;i<=ss.length()-1;i++)
                sum+=ss.charAt(i)-'0';
            ss=new StringBuilder(String.valueOf(sum));
            k--;
        }
        return sum;
    }
}