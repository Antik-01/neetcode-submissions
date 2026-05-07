class Solution {
    public int[] productExceptSelf(int[] nums) {
        int m = 1;
        boolean zeroPresent=false;
        int cntZero = 0;
        for(int n: nums){
            if(n==0){
                zeroPresent = true;
                cntZero++;
            }
            else m*=n;
        }
        if(cntZero>1) return new int[nums.length];

        int[] arr = new int[nums.length];
        for(int i=0; i<arr.length; i++){
            if(zeroPresent){
                if(nums[i]!=0){
                    arr[i] = 0;
                }
                else arr[i] = m;
            }
            else arr[i] = m/nums[i];
        }
        return arr;
    }
}  
