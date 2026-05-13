class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // List<List<Integer>> res = new ArrayList<>();
        // for(int i=0; i<nums.length-2; i++){
        //     for(int j=i+1; j<nums.length-1; j++){
        //         for(int k=j+1; k<nums.length; k++){
        //             if(nums[k] + nums[i] +nums[j] == 0){
        //                 List<Integer> li = new ArrayList<>();
        //                 li.add(nums[i]);
        //                 li.add(nums[j]);
        //                 li.add(nums[k]);
        //                 res.add(li);
        //             }
        //         }
        //     }
        // }
        // return res;

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0) break;
            while(i>0 && i<nums.length && nums[i] == nums[i-1]) i++;

            int l = i+1, r = nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum>0) r--;
                else if(sum<0) l++;
                else{
                    res.add(new ArrayList<>( Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                    while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                }
            }
        }
        return res;
    }
}
