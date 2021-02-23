class Solution {
    public int jump(int[] arr) {    
                
        int start=0;
        int end = arr.length-1;
        int counter=0;
        boolean flag=false;
        
        while(start<end){
            
           int range=start+arr[start];
           System.out.println("range ="+range);
           if(range>=end){
                 counter++;
                 //System.out.println("Min Jumps are -- "+counter);
                 // break;
               return counter;
           }
            int current=start+1;
             int maxjumpIndex=Integer.MIN_VALUE;
              
             while(current<=range)
             {
                 
                if(arr[current]!=0){
                    
                     int tempjump=current+arr[current];
                     if(tempjump>=maxjumpIndex){
                     maxjumpIndex=tempjump;
                     start=current;
                     // System.out.println("Index "+current+"  value "+arr[current]+"  jump "+tempjump);
              }
                
                if(maxjumpIndex>=end){
                 break;
                }
                    
                }
 
                current++;
                
            }
            
             if(maxjumpIndex==Integer.MIN_VALUE){
                 // System.out.println("Bye Bye......exit");
                 return -1;
               //  break;
             }
             //start=maxjumpIndex;
           
           counter++;           
           // System.out.println("Counter: "+counter);
             
        }
        
        return counter;
    }
      

}