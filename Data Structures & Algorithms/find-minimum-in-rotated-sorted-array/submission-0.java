class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length-1;
        int min = Integer.MAX_VALUE;
        while(l<=h){
            int m = l+(h-l)/2;
            if(nums[l] <= nums[m] && nums[m] <= nums[h]){
                min = Math.min(min, nums[l]);
                h = m-1;
            }
            else if(nums[m] > nums[h]){
                min = Math.min(min, nums[h]);
                l = m+1;
            } 
            else{
                min = Math.min(min, nums[m]);
                h = m-1;
            }
        }
        return min;
    }
}
