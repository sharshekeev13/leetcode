class Solution {    
    public String freqAlphabets(String s) {
        StringBuffer sb=new StringBuffer();
        int n=s.length();
        int pos=n-1;//last
        while(pos>=0)
        {
               if(s.charAt(pos)=='#')
               {
                       int a=(int)(s.charAt(pos-2)-'0');
                       int b=(int)(s.charAt(pos-1)-'0');
                       int numb=a*10+b;
                       char generate=(char)('a'+numb-1);
                       sb.append(generate);
                       pos=pos-3;
               }
                else
                {
                        int numb=(int)(s.charAt(pos)-'0');
                        char generate=(char)('a'+numb-1);
                       sb.append(generate);
                       pos=pos-1;                        
                }
        }
        
        return sb.reverse().toString();
    }
}