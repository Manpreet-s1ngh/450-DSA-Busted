public static int doUnion(int a[], int n, int b[], int m) 
{
    //Your code here
   Set<Integer> myset=new HashSet<Integer>();
   // for sorted array we can use TreeSet;
   
   int i=0;
   while(i<n)
   {
    myset.add(a[i++]);   
   }
   i=0;
   while(i<m){
       myset.add(b[i++]);
   }
   
   return myset.size();
 
}