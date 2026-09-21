class Solution { 
    public int binarySearch(int l,int r,int nums[],int target){
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target>nums[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int l=0;int r=nums.length-1;
        while(l<r){
            int m=l+(r-l)/2;
            if(nums[m]>nums[r]){
                l=m+1;
            }

            else{
                r=m;
            }
        }
        int pivot=l;
        int result= binarySearch(0,pivot-1,nums,target);
        if(result!=-1){
            return result;
        }
        return binarySearch(pivot,nums.length-1,nums,target);
    }
}

