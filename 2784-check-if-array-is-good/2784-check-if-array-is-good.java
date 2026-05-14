class Solution {
    public boolean isGood(int[] nums) {
        
        if(nums.length < 2){
            return false;
        }else{
            int max = 0;
            HashMap<Integer, Integer> freq = new HashMap<>();
            for (int num : nums) {
                if(max < num){
                    max = num;
                }
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
            if(nums.length == max+1 && freq.getOrDefault(max, 0) == 2){
                for (int key : freq.keySet()) {
                    if (key != max && freq.get(key) > 1) {
                        return false;
                    }
                }

                return true;
            }else{
                return false;
            }
        }
    }
}