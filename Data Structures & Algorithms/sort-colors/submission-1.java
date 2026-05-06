class Solution {
    public void sortColors(int[] nums) {
        // kal dekhbo
        int[] counter = new int[3];
        for(int n : nums){
            counter[n]++;
        }
        int idx=0, i=0;
        while(i<nums.length){
            while(counter[idx]-- > 0 ){
                nums[i++] = idx;
            }
            idx++;
        }
        // int cnt0=0,cnt1=0, cnt2=0;
        // for(int n: nums){
        //     if(n==0) cnt0++;
        //     else if(n==1) cnt1++;
        //     else if(n==2) cnt2++; 
        // }
        // int idx=0;
        // while(idx<nums.length){
        //     if(cnt0>0){
        //         nums[idx++] = 0;
        //         cnt0--;
        //     }
        //     else if(cnt1>0){
        //         nums[idx++] = 1;
        //         cnt1--;
        //     }
        //     else if(cnt2>0){
        //         nums[idx++] = 2;
        //         cnt2--;
        //     }
        // }
    }
}