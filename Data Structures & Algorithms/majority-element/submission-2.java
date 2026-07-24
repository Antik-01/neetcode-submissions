class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, cnt=0;
        for(int n : nums){
            if( cnt == 0) candidate = n;
            if(candidate == n) cnt++;
            else cnt --;
        }
        return candidate;
    }
}