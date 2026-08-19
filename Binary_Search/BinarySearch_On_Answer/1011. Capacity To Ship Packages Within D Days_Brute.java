 
class Solution {

    public int shipWithinDays(int[] weights, int days) {

       int low=0; 
       int high=0;

       //calculating low and high 
       for(int weight:weights){
            low=Math.max(weight,low);
            high+=weight;
       }

       //capacity
       
       for(int capacity=low;capacity<=high;capacity++){
            if(canShip(weights,days,capacity)){
                return capacity;
            }
       }

       return high;

        // while(low<high){
        //     int mid=low+(high-low)/2;
        //     if(canShip(weights,days,mid)){
        //         high=mid;
        //     }
        //     else{
        //         low=mid+1;
        //     }

        // }
        // return low;


    }

    private boolean canShip(int weights[],int days,int capacity){
        int currentWeight=0;
        int daysCount=1;

        for(int weight:weights){
            currentWeight+=weight;
            if(currentWeight>capacity){
                daysCount++;
                currentWeight=weight;
        }
        }

        return daysCount<=days;
    }
}
