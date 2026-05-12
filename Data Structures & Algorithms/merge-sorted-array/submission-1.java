class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, l = m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[l--] = nums1[i--];
            }
            else nums1[l--] = nums2[j--];
        }
        // int i = 0, j=0, k=0;
        // int len = nums1.length;
        // int[] temp = new int[len];
        // while(k<len){
        //     while(i<m && j<n){
        //         if(nums1[i] <= nums2[j]){
        //             temp[k++] = nums1[i++];
        //         }
        //         else if(nums1[i] > nums2[j]){
        //             temp[k++] = nums2[j++];
        //         }
        //     }
        //     while(i<m){
        //         temp[k++] = nums1[i++];
        //     }
        //     while(j<n){
        //         temp[k++] = nums2[j++];
        //     }
        // }
        // for(i=0; i<len; i++){
        //     nums1[i] = temp[i];
        // }
    }

}