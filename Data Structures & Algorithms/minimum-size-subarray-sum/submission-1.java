class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int[] pref = new int[nums.length];
        pref[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            pref[i] = pref[i-1]+nums[i];
        }
        int res = Integer.MAX_VALUE;;
        int l = 0, r = 0;
        while(r<pref.length){
            while(r<pref.length && pref[r]<target ) r++;
            if(r>=nums.length) break;
            res = Math.min(res, r-l+1);
            while(l<r && pref[r]-pref[l]>=target){
                res = Math.min(res, r-l);
                l++;
            }
            r++;
        }
        return (res>nums.length)? 0 : res;  
    }
}