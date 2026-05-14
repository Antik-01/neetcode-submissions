class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }
        for(int i = 0; i<nums.length; i++){
            if(!set.contains(i+1)) return i+1;
        }
        return nums.length+1;
    }
}