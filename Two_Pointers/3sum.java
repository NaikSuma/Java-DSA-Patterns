
class Solution {
    // public List<List<Integer>> threeSum(int[] nums) {
    //     Set<List<Integer>> ans=new HashSet<>();
    //     int n=nums.length;
    //     for(int i=0;i<n;i++){
    //         Set<Integer> hashSet=new HashSet<>();
    //         for(int j=i+1;j<n;j++){
    //             //for(int k=j+1;k<n;k++){
    //                 int third=-(nums[i]+nums[j]);


    //                 if(hashSet.contains(third)){
    //                     List<Integer> temp=Arrays.asList(nums[i],nums[j],third);
    //                     Collections.sort(temp);
    //                     ans.add(temp);

    //                 }
    //                 hashSet.add(nums[j]);

    //         }

    //     }
    //     return new ArrayList<>(ans);
    // }
   

   //1. Brute force
    public List<List<Integer>> threeSum(int[] nums){

        HashSet<List<Integer>> st=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(temp);
                        st.add(temp);

                    }
                }
            }
        }

        return new ArrayList<>(st);
    }

   
    
    }
        
}
     
    
