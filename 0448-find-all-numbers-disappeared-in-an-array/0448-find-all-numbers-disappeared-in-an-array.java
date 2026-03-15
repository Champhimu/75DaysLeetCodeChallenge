class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
            while(nums[i] > count){
                list.add(count);
                count++;
            }

            if(nums[i] == count){
                count++;
            }
        }

        while(count <= nums.length){
            list.add(count);
            count++;
        }
        return list;
    }
}