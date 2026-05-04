class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0, high = nums.length-1;
        return mergeSort(nums, low, high);

    }
    public int[] mergeSort(int[] nums,int left, int right){
        if(left<right){
            int low = left;
            int high = right;
            int mid = low + (high - low) / 2;
            int[] lArr = mergeSort(nums, low, mid);
            int[] rArr = mergeSort(nums, mid+1, high);

            int[] res = new int[lArr.length + rArr.length];
            int idx=0, i=0, j=0;
            while(idx < res.length){
                if(i<lArr.length && j<rArr.length && lArr[i]<=rArr[j]){
                    res[idx++] = lArr[i++];
                }else if(i<lArr.length && j<rArr.length && lArr[i]>rArr[j]){
                    res[idx++] = rArr[j++];
                }else if(i<lArr.length){
                    res[idx++] = lArr[i++];
                }else{
                    res[idx++] = rArr[j++];
                }
            }
            return res;
        }
        return new int[]{nums[left]}; 
        
    }

}