class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double answer=Integer.MIN_VALUE;
        double sum=0;
        int j = k;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        answer = sum/k;

        while(j<=nums.length-1){
            sum-=nums[j-k];
            sum+=nums[j];
            j++;

            if(sum/k > answer){
                answer = sum/k;
            }
        }

        return answer;
    }
}