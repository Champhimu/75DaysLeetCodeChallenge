class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int r=nums.length-1;

        while(l<r){
            int mid= l+(r-l)/2;
            boolean hasEven = (r-mid)%2 == 0;

            if(nums[mid+1] == nums[mid]){
                if(hasEven){
                    l=mid+2;
                }else{
                    r=mid-1;
                }
            }else if(nums[mid-1] == nums[mid]){
                if(hasEven){
                    r=mid-2;
                }else{
                    l=mid+1;
                }
            }else{
                return nums[mid];
            }
        }
        return nums[l];
    }
}