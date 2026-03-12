class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int tar = target - nums[i];
            if(h.containsKey(tar)){
                return new int[]{h.get(tar), i};
            }
            h.put(nums[i], i);
        }

        return new int[]{};
    }
}