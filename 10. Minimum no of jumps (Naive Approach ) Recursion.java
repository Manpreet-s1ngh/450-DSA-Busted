class Solution {
    public int jump(int[] nums) {
        return jumphelper(0,nums);
        
    }
//         static int jumpy(int arr[], int start){
        
//         int end=arr.length-1;
//         if(start==end){
//             return 0;
//         }
            
//         int range=start+arr[start];
//             if(range>=end){
//                 return 1;
//             }
//         int minjump=Integer.MAX_VALUE;
            
//             for(int i=start+1; i<=range;i++){
//                 int tempmin=jumpy(arr,i);
                
//                 if(tempmin!=Integer.MAX_VALUE && tempmin+1 < minjump ){
//                     minjump=tempmin+1;
//                 }
                
//             }
        
//             return minjump;
        
        
//     }
    
    
     public int jumphelper(int i , int[] nums){

        int n = nums.length;
        if(i == n-1) return 0; //end is reached
        int range = i+nums[i];
        if(range >= n-1) return 1; // if the next jump range exceed the array length, then we can reach the end by only one jump
       
        int min = Integer.MAX_VALUE; 
        
        for(int j  = i +1; j <= range ; j++){
            
            int jumps =  jumphelper(j,nums);
            
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps +1;
            
        }
        return min;
        
    }
}