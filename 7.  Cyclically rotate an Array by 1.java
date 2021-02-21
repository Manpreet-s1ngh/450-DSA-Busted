
class Compute {
    
    public void rotate(long arr[], long n)
    {
       //from end to front ...easy
        long store=arr[arr.length-1];
        
        for(int last=arr.length-1;last>=1;last--)
        {
            arr[last]=arr[last-1];
        }
        arr[0]=store;
        
        // from front to end----
        long store=arr[arr.length-1];
        long next;
        for(int i=0;i<arr.length;i++)
        {
            next=arr[i];
            arr[i]=store;
            store=next;
        }
      
        
    }
}