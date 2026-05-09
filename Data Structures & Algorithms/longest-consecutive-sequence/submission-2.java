class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length==0) return 0;
        int res = 1;
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; i++){
            int curr = nums[i];
            int currlen = 1;
            for(int j=i+1; j<nums.length; j++){
                if(nums[j]== curr+1){
                    currlen++;
                    curr +=1;
                }
            }
            if(currlen>res) res = currlen;
                currlen = 1;
        }
        return res;
    }
}
