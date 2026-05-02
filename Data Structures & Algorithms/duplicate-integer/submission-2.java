class Solution {
    public boolean hasDuplicate(int[] nums) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int n: nums){
        //     if(map.get(n) != null)
        //         return true;
        //     map.put(n, map.getOrDefault(n,0)+1);
        // }
        // return false;  high space complexity
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            if(set.contains(n)) return true;
            else set.add(n);
        }
        return false;
    }
}