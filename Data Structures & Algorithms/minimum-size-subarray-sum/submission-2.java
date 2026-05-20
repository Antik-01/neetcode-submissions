class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0, res = Integer.MAX_VALUE, l= 0;
        for(int r = 0; r<nums.length; r++){
            sum += nums[r];
            while(sum>=target){
                res = Math.min(res, r-l+1);
                sum -=  nums[l++];
            }
        }
        return (res>nums.length) ? 0 : res;
    }
}