class Solution {
    public int findKthLargest(int[] nums, int k) {
                    
       return large(nums, k ,nums.length-1);
        
    }
    
    
    static int large(int[] nums,int k,int end)
    {
        if(k==0){
            return nums[end+1];
         }
        
        int largest=Integer.MIN_VALUE;
        int index=0;
        
        for(int i=0;i<=end;i++)
        {
            if(nums[i]>largest )
            {
                largest=nums[i];
                index=i;    // storing the index of largest element
            }
        }
        
      // Pushing the lagest value at the end Of Array
        int extra=nums[index];
        nums[index]=nums[end];
        nums[end]=extra;
       
       // System.out.println(largest);
        return large(nums,k-1,end-1);
        
    }
   
}
