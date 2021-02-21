class Kadane{
    
    // Function to find subarray with maximum sum
    // arr: input array
    // n: size of array
    int maxSubarraySum(int arr[], int n){
        
        // Your code here
        int largestSum=Integer.MIN_VALUE;
        int sumTillNow=0;
        
        for(int i=0;i<n;i++){
            
            sumTillNow+=arr[i];
            if(largestSum<sumTillNow){
                largestSum=sumTillNow;
            }
            if(sumTillNow<0){
                // if sum till now is < 0, means there will be no benefit of them
                sumTillNow=0;
            }
        }
        return largestSum;
        
    }