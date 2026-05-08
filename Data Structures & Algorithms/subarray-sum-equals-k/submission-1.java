class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> subSum = new HashMap<>();
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = 0;
            for(int j=i; j<nums.length; j++){
                sum += nums[j];
                if(sum==k) subSum.put(sum, subSum.getOrDefault(sum, 0)+1);
            }
        }
        if(subSum.get(k) == null) return 0;
        return subSum.get(k);
    }
}