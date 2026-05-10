class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int n: nums){
            count.put(n, count.getOrDefault(n, 0)+1);
        }
        for(int k : count.keySet()){
            if(count.get(k)>(nums.length/3)){
                res.add(k);
            }
        }
        return res;
    }
}