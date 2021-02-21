class Solution {
    
    class Pair{
    int value;
    int index;
    Pair(int value,int index){
        this.value=value;
        this.index=index;
    }
    int getValue(){
        return this.value;
    }
    
    int getIndex(){
        return this.index;
    }
}

    int getMinDiff(int[] arr, int n, int k) {
        // code here
        ArrayList<Pair> possibleHeights=new ArrayList<>(); 
        int visited[]=new int[n];
        
        // creating objects of each possibility and storing them into List of PossibleHeights..
        for(int i=0;i<n;i++){
            if(arr[i]-k >= 0){
                possibleHeights.add( new Pair( arr[i]-k , i ));
            }
            
            possibleHeights.add( new Pair( arr[i]+k , i ));
            visited[i]=0;
        }
        
        // sorting our PossibleHeights List....
        Collections.sort(possibleHeights,new Comparator<Pair>(){
            public int compare(Pair p1, Pair p2){
                return p1.getValue()-p2.getValue() ;
            }
        } );
        
        
        int element=0; // for counting the total element for making window
        int left=0; //left index
        int right=0; // right index for window
        
        int size=possibleHeights.size();
        
        while(element<n && right<size){
            
            // checking the index of Visited Array... if 0 the element increase...
            if( visited[possibleHeights.get(right).getIndex()] == 0){
              element++;  
            } 
            // incrase the visted ounter for that particular index...
             visited [ possibleHeights.get(right).getIndex() ]++;
             right++; // moving ahed the right index.....
        }
        
        //now calculate the difference of the heights of First Window
        int ans= possibleHeights.get(right-1).getValue() - possibleHeights.get(left).getValue();
        
        while(right<size){
            
            // Removing the First element from the Window and decreasing element..
             if( visited[possibleHeights.get(left).getIndex()] == 1 ){
                 element--;
             }
             
             visited[possibleHeights.get(left).getIndex()]--; // decreasing the visted index..
             left++; // moving left to one step ahead..
             
        // again performing above task ,increasing the visited index until it is not equl to total elements
             while(element<n && right<size){
                 if( visited[ possibleHeights.get(right).getIndex()]==0){
                     element++;
                 }
                 visited[possibleHeights.get(right).getIndex()]++;
                 right++;
             }
             
         // if we found all total element the Calculate the new Diff and compare with old Ans..
             if(element==n){
    ans=Math.min(ans, possibleHeights.get(right-1).getValue() - possibleHeights.get(left).getValue() );
                    
             }
             else{ // if we dont found all elements in window till end... the exit from window 
                 break;
             }
        }
        
        return ans; // returning the minimum difference....
        
    }
    
}
