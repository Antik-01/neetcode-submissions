class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        Set<Integer> present = new HashSet<>();
        for(int r = 0; r<nums.length; r++){
            if(r-l > k){
                present.remove(nums[l++]);
            }
            if(present.contains(nums[r])){
                return true;
            }
            present.add(nums[r]);
        }
        return false;
    }
}