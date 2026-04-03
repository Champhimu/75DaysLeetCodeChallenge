class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxConsecutive1 = 0;
        int i=0;
        int zero = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] == 0){
                zero++;
            }

            while(zero > k){
                if(nums[i] == 0){
                    zero--;
                }
                i++;
            }

            maxConsecutive1 = Math.max(maxConsecutive1, j-i+1);
        }

        return maxConsecutive1;
    }
}