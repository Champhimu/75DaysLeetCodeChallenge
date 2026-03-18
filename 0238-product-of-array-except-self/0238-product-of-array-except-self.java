class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,1);
        int suffix = 1;
        int prefix = 1;
        // ans[0] = 1;
        // ans[nums.length-1] = 1;
        for(int i=1; i<nums.length; i++){
            // System.out.println(ans[i] +" "+ nums[i-1]);
            prefix *= nums[i-1];
            ans[i] *= prefix;
        }

        for(int j=nums.length-2; j>=0; j--){
            suffix *= nums[j+1];
            ans[j] *= suffix;
        }

        return ans;
    }
}