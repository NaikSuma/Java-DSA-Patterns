
class Solution {
    public boolean isPerfectSquare(int num) {
        
        for(int i=1;i<=num;i++){
            long square=(long)i*i;
            if(square==num){
                return true;
            }
            if(square>num){
                break;
            }
        }
        return false;

       
        return false;
    }
}
