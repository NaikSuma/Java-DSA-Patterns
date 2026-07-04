
class Solution {
    public int[] twoSum(int[] numbers, int target) {

        //2. optimised
        int left=0;
        int right=numbers.length-1;
        int sum=0;

        while(left<=right){
            sum=numbers[left]+numbers[right];
            if(target==sum){
                return new int[]{left+1,right+1};
            }
            else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{};


    }
}
