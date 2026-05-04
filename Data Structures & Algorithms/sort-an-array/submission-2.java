class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;

    }
    private void mergeSort(int[] nums,int l, int r){
        if(l>=r) return;
        int m = l + (r - l) / 2;
        mergeSort(nums, l, m);
        mergeSort(nums, m+1, r);
        merge(nums, l, m, r);
    }
    private void merge(int[] nums,int l, int m, int r){
        int[] temp = new int[r-l+1];
        int i=l, j=m+1, k=0;
        while(i<=m && j<=r){
            temp[k++] = nums[i] <= nums[j] ? nums[i++] : nums[j++];
        }
        while(i<=m){
            temp[k++] = nums[i++];
        }
        while(j<=r){
            temp[k++] = nums[j++];
        }
        for(k=0; k<temp.length; k++){
            nums[l+k] = temp[k];
        }
    }

}