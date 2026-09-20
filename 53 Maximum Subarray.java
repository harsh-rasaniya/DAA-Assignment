class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i =0; i<nums.length ; i++){
            if(sum<0 && nums[i]>0){
                sum = nums[i];
                max = sum;
                continue;
            }
            sum+=nums[i];
            max = Math.max(nums[i],Math.max(max,sum));
            if(max > 0 && sum < 0) sum =0 ;
        }
        return max;
    }
}