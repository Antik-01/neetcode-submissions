class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j=0, k=0;
        int len = nums1.length;
        int[] temp = new int[len];
        while(k<len){
            while(i<m && j<n){
                if(nums1[i] <= nums2[j]){
                    temp[k++] = nums1[i++];
                }
                else if(nums1[i] > nums2[j]){
                    temp[k++] = nums2[j++];
                }
            }
            while(i<m){
                temp[k++] = nums1[i++];
            }
            while(j<n){
                temp[k++] = nums2[j++];
            }
        }
        for(i=0; i<len; i++){
            nums1[i] = temp[i];
        }
    }

}