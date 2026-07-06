
import java.util.*;

class Solution {
   
    //1.Bruteforce

    public List<List<Integer>> fourSum(int[] nums, int target){
        Set<List<Integer>> st=new HashSet<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        int sum=nums[i]+nums[j]+nums[k]+nums[l];
                        if(sum==target){
                            List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            st.add(temp);
                        }
                    }
                }
            }
        }
        return new ArrayList<>(st);
    } 
    
}
