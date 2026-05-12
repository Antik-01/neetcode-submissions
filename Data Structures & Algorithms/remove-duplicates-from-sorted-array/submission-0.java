class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1) return nums.length;
        int i=0, num = -101;
        for(int j=i; j<nums.length; j++){
            if(num != nums[j]){
                nums[i++] = num = nums[j];
            }
            else{
                continue;
            }
        }
        return i;
    }
}