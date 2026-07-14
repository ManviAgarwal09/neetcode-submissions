class Solution {
    public int findDuplicate(int[] nums) {
    Set<Integer>hs= new HashSet<>();
    int n=nums.length;
    for(int i:nums){
        if(hs.contains(i)){
            return i;
        }
        hs.add(i);
    }
    
    return -1;
}
}