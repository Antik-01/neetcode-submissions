class Solution {
    public int removeElement(int[] nums, int val) {
        int cnt=0, x=0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != val){
                nums[x] = nums[i];
                x++;
                cnt++;
            }
        }
        return cnt;
    }
}