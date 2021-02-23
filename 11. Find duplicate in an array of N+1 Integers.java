class Solution {
    public int findDuplicate(int[] nums) {
        
           
        for(int i=0;i<nums.length;i++){
            int value=nums[i];
            for(int j=0;j<nums.length;j++){
                if(j==i){
                    continue;
                }
                if(nums[j]==value){
                    return value;
                }
            }
        }
        return -1;
        
    }
}