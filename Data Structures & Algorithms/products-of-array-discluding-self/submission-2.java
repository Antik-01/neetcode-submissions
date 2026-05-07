class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length, m=1;
        int[] res = new int[n];
        for(int i=0; i<n; i++){
            res[i] = m;
            m *= nums[i];
        }

        m=1;
        for(int i=n-1; i>=0; i--){
            res[i] *= m;
            m *= nums[i];
        }
        return res;

        // int n = nums.length, m=1;  // O(n) 3 passes
        // int[] pref = new int[n];
        // int[] suff = new int[n];
        // for(int i=0; i<n; i++){
        //     pref[i] = m;
        //     m *= nums[i];
        // }
        // m=1;
        // for(int i=n-1; i>=0; i--){
        //     suff[i] = m;
        //     m *= nums[i];
        // }
        // int[] res = new int[n];
        // for(int i=0; i<n; i++){
        //     res[i] = pref[i]*suff[i];
        // }
        // return res;



        // int m=1;     // O(2*n)
        // boolean zeroPresent=false;
        // int cntZero = 0;
        // for(int n: nums){
        //     if(n==0){
        //         zeroPresent = true;
        //         cntZero++;
        //     }
        //     else m*=n;
        // }
        // if(cntZero>1) return new int[nums.length];

        // int[] arr = new int[nums.length];
        // for(int i=0; i<arr.length; i++){
        //     if(zeroPresent){
        //         if(nums[i]!=0){
        //             arr[i] = 0;
        //         }
        //         else arr[i] = m;
        //     }
        //     else arr[i] = m/nums[i];
        // }
        // return arr;
    }
}  
