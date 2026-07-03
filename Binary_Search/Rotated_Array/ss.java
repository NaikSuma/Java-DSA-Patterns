
class Solution {
    public int search(int[] nums, int target) {
       

        //2.Optimal ->binary search

        int low=0;
        int  high=nums.length-1;

        while(low<=high){
            int mid=low+(high-low)/2;


            if(nums[mid]==target){
                return mid;
            }

            //left part is sorted
            if(nums[low]<=nums[mid]){

                //target lies in a sorted left
                if(nums[low]<=target&&target<nums[mid]){
                     high=mid-1;
            }
            else{

                //else search in a right half
                low=mid+1;
            }
            }
            else{
                //right part is sorted

                if(nums[mid]<target&&target<=nums[high]){
                    //target lies in a right part
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }

        return -1;


    }
}
