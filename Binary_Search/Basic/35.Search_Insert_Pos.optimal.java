
class Solution {
    public int searchInsert(int[] nums, int target) {
        
        /


        //1.Brute 
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>=target){
        //         return i;
        //     }
        // }
        // return nums.length;

        //2.Optimal->binary

        int n=nums.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

    return low;
    }
}
