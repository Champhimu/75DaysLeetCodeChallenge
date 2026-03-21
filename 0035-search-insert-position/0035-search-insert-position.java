class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int ans= nums.length-1;

        while(l<=r){
            System.out.println(l + " "+ r);
            int mid = l+(r-l)/2;

            if(nums[mid] == target){
                return mid;
            }

            if(nums[mid] < target){
                if(nums.length - 1 == l ){
                    ans++;
                }
                l = mid + 1;
            }else{
                ans = mid;
                r = mid - 1;
            }
        }
        return ans;
    }
}