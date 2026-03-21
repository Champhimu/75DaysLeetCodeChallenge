class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=0;
        while(i<nums.length){
            if(nums[j] != 0 && j<nums.length-1 ){
                j++;
            }
            if(nums[i]!=0 && nums[j] == 0 && j<i){
                nums[j] = nums[i];
                nums[i] = 0;
                // j=i;
            }
            i++;
        }
    }
}