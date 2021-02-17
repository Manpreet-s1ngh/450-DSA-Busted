//.. Reverse an Array ...

class Solution {
    public void reverseString(char[] s) {
        System.out.println(s.length/2);
        
            int end=s.length-1;
            int beg=0;
        
        while(beg<end)
        {
            // swapping first and last ....and so on
            char n=s[beg];
            s[beg++]=s[end];
            s[end--]=n;
        }
        
    }
   
}