class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            if(map.get(n) != null)
                return true;
            map.put(n, map.getOrDefault(n,0));
        }
        return false;
    }
}