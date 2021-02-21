// My solution

class Solution {
    public void sortColors(int[] nums) {
        int zero=-1; //index of  existing zero
        int one=-1; //index for existing one
        int i=0;   // our current index;
        
        while(i<nums.length)
        { 
            if(nums[i]==0 && (zero+1)<nums.length){
                
                int extra=nums[zero+1];
                nums[zero+1]=nums[i];
                nums[i]=extra;
                zero++;
                
                if(one==-1)
                {    i++;
                    // if one==-1 means there in no exsisting 1
                   // so we can increment current index after swapping
                  // because in this case 1 will not be swapped....           
                }
                else{
                    continue; 
                    // check again on current index...
                  }
               
                
            }
            else if(nums[i]==1){
                if(one==-1){
                    // if there is no one just put current 1 ahead to zeros..
                    int extra=nums[zero+1];
                    nums[zero+1]=nums[i];
                    nums[i]=extra;
                    one=zero+1;
                    i++;
                }
                else{
                //if there is already 1,then put current 1 ahead of existing 1
                    int extra=nums[one+1];
                    nums[one+1]=nums[i];
                    nums[i]=extra;
                    one++;
                    i++;
                }
            }
            else{ // means current element is 2,so increase index,
                i++;
            }
            
        }
    }
}




// Second Solution--Java, 100%, O(n), O(1)

class Solution {
    public void sortColors(int[] nums) {
        // collor counters
        int[] arr = new int[3];
        // count colors
        for(int n : nums) arr[n]++;
        // populate by color
        for(int i=0, c = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i]; j++){
                nums[c++] = i;
            }
        }
    }
}