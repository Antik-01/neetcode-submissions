class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int i=0, num = -101;
        for(int j=i+1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                nums[++i] = num = nums[j];
            }
        }
        return i+1;
    }
}