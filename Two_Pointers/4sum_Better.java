import java.util.*;

class Solution {

    //2.Better approach
    public List<List<Integer>> fourSum(int[] nums, int target){

        HashSet<List<Integer>> st=new HashSet<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                HashSet<Integer> seen=new HashSet<>();

                for(int k=j+1;k<n;k++){
                    int fourth=target-nums[i]-nums[j]-nums[k];
                    if(seen.contains(fourth)){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],fourth);
                        Collections.sort(temp);
                        st.add(temp);
                    }
                    seen.add(nums[k]);
                }
            }
        }

        return new ArrayList<>(st);
    }
    
}

