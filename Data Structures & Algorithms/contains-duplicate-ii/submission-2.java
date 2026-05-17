class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length==1 || k == 0) return false;
        int l=0, r=1;
        while(r<nums.length){
            if(Math.abs(l-r) <= k){
                if(nums[l] == nums[r]) return true;
                r++;
            }
            else{
                while(l<r-1){
                    l++;
                    if(nums[l] == nums[r]) return true;
                }
            }
        }
        return false;
    }
}