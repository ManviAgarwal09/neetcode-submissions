class Solution {
    public void subset(List<List<Integer>>ans,int []nums,int idx,List<Integer>curr){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        subset(ans,nums,idx+1,curr);
        curr.remove(curr.size()-1);
        subset(ans,nums,idx+1,curr);
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();;
        List<Integer>curr=new ArrayList<>();
        subset(ans,nums,0,curr);
 return ans;
    }
}
        
     
