class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        int res=-1; 
        for(int key : mp.keySet()){
            if(mp.get(key) >(nums.length/2)){
                res = key;
                break;
            }
        }
        return res;
    }
}