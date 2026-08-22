class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = 0;
        Set<Integer> present = new HashSet<>();
        present.add(nums[l]);
        for(int r = l+1; r<nums.length; r++){
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