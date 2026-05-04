class Solution {
    public void sortColors(int[] nums) {
        int cnt0=0,cnt1=0, cnt2=0;
        for(int n: nums){
            if(n==0) cnt0++;
            else if(n==1) cnt1++;
            else if(n==2) cnt2++; 
        }
        int idx=0;
        while(idx<nums.length){
            if(cnt0>0){
                nums[idx++] = 0;
                cnt0--;
            }
            else if(cnt1>0){
                nums[idx++] = 1;
                cnt1--;
            }
            else if(cnt2>0){
                nums[idx++] = 2;
                cnt2--;
            }
        }
    }
}