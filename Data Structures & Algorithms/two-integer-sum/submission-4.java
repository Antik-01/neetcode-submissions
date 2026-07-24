class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int val = target - nums[i];
            if(mp.get(val)!=null) return new int[]{mp.get(val), i};
            mp.put(nums[i], i);
        }
        return new int[0];
    }
}
