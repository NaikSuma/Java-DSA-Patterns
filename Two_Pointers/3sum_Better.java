class Solution {
    

    //2.better approach
    public List<List<Integer>> threeSum(int[] nums){
        int n=nums.length;
        HashSet<List<Integer>> st=new HashSet<>();

        for(int i=0;i<n;i++){
            HashSet<Integer> seen=new HashSet<>();

            for(int j=i+1;j<n;j++){
                int third=-(nums[i]+nums[j]);

                if(seen.contains(third)){
                    List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
                    Collections.sort(temp);
                    st.add(temp);
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(st);
    }

  
    
    }
        
}
     
    
