class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
       int n=nums.length;
      Set<List<Integer>>re=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                List<Integer>tmp=Arrays.asList(nums[i],nums[j],nums[k]);
                re.add(tmp);
                }
            }
        }
        }
        return new ArrayList<>(re);
    }
}