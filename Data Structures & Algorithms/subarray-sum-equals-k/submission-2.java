class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefSum = new HashMap<>();
        int sum = 0, res = 0;
        for(int i=0; i<nums.length; i++){
            sum+= nums[i];
            if(sum == k) res++;

            if(prefSum.containsKey(sum-k)){
                res+=prefSum.get(sum-k);
            }

            prefSum.put(sum, prefSum.getOrDefault(sum, 0)+1);
        }
        return res;

        // for(int i=0; i<nums.length; i++){
        //     sum = 0;
        //     for(int j=i; j<nums.length; j++){
        //         sum += nums[j];
        //         if(sum==k) subSum.put(sum, subSum.getOrDefault(sum, 0)+1);
        //     }
        // }
        // if(subSum.get(k) == null) return 0;
        // return subSum.get(k);
    }
}