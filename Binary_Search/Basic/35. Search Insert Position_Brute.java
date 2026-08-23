
class Solution {
    public int searchInsert(int[] nums, int target) { 
        
        // int left=0;
        // int n=nums.length; 
        // int right=n-1;
 
        // int ans=n;

        // while(left<=right){
        //     int mid=left+(right-left)/2;

        //     if(nums[mid]>=target){
        //         ans=mid;
        //         right=mid-1;
        //     }
        //     else {
        //         left=mid+1;
        //     }
            
        // }
        // return ans;


        //1.Brute 
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;

        //2.Optimal->binary

    //     int n=nums.length;
    //     int low=0;
    //     int high=n-1;

    //     while(low<=high){
    //         int mid=low+(high-low)/2;

    //         if(nums[mid]==target){
    //             return mid;
    //         }
    //         else if(nums[mid]<target){
    //             low=mid+1;
    //         }
    //         else{
    //             high=mid-1;
    //         }
    //     }

    // return low;
    }
}
