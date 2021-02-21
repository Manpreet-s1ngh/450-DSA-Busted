// moving the positive element to right with maintained order..by shifting the positive element to next index..

import java.io.*;

class GFG {
	public static void main (String[] args) {
		System.out.println("GfG!");
		
	   int arr[]={-1, 2, -3, 4, 5, 6, -7, 8, 9 };
	                
	                  
	   int length=arr.length;
	   work(arr,length);
	   for (int elemtent:arr){
	       System.out.print(elemtent+", ");
	   } 
	}
	static void work(int arr[],int length){
	    int positive=-1; // store the index of positive element;
	    int i=0; // currentindex
	    while(i<length){
	        
	        if ( arr[i]<0){
	            
	            if(positive==-1){ // if there is no positive element,move forward
	                i++;
	            }else{ // if there is positive no. shift them to next index..
	                shift(arr,i,positive);
	                positive++; // increment the positive index by 1
	                i++; // move to next index
	            }
	        }else{
	            if(positive==-1) //if there is no positive no, store index of first positive no..
	            {
	                positive=i;
	            }
	            i++; // move to next index..
	        } 
	    }
	}
	// shifting the positive element to next index to maintain order or positive elements..
	static void shift(int arr[],int currentindex,int positive){
	    int pick=arr[positive];
	    arr[positive]=arr[currentindex];
	    for(int i=positive;i<currentindex;i++){
	        int nextpic=arr[i+1];
	        arr[i+1]=pick;
	        pick=nextpic;
	    }
	    
	}
}