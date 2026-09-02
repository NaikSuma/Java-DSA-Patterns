class Solution {
    public boolean search(int[] nums, int target) {
        
        // 1.bruteforce  

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){ 
                return true;
            }
        }
        return false;

       

    }
}
