class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0; i<numbers.length; i++){
            int diff = target - numbers[i];

            if(h.containsKey(diff)){
                return new int[]{h.get(diff)+1, i+1};
            }
            h.put(numbers[i],i);
        }

        return new int[]{};
    }
}