class Solution {
    public int trap(int[] height) {
        int totalWater = 0;
        int n = height.length;
        int[] pref = new int[n];
        int[] suff = new int[n];

        pref[0] = 0;
        for(int i = 1;i< n; i++){
            pref[i] = Math.max(pref[i-1], height[i-1]);
        }
        suff[n-1] = 0;
        for(int i=n-2; i>=0; i--){
            suff[i] = Math.max(suff[i+1], height[i+1]);
        }

        for(int i = 0; i<n; i++){
            int curr = Math.min(pref[i], suff[i])-height[i];
            if(curr>0){
                totalWater += curr;
            }
        }
        return totalWater;
    }
}
