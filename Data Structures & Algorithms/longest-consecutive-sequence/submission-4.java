class Solution {
    public int longestConsecutive(int[] nums) {
        // if (nums.length==0) return 0;   // O(n2)
        // int res = 1;
        // Arrays.sort(nums);
        // for(int i=0; i<nums.length-1; i++){
        //     int curr = nums[i];
        //     int currlen = 1;
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[j]== curr+1){
        //             currlen++;
        //             curr +=1;
        //         }
        //     }
        //     if(currlen>res) res = currlen;
        //         currlen = 1;
        // }
        // return res;


        // if (nums.length==0) return 0;    // O(nlogn)
        // int res = 1, currcnt = 1, lastsmallest = Integer.MIN_VALUE;

        // Arrays.sort(nums);
        // for(int i=0; i<nums.length; i++){
        //     if(nums[i]-1 == lastsmallest){
        //         currcnt++;
        //         lastsmallest = nums[i];
        //     }
        //     else if(nums[i] == lastsmallest) continue;
        //     else{
        //         currcnt = 1;
        //         lastsmallest = nums[i];
        //     }
        //     if(currcnt>res) res = currcnt;
        // }
        // return res;

        
        Set<Integer> present = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            present.add(nums[i]);
        }
        int res = 0, curr = 0, currmax= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(!present.contains(nums[i]-1)){
                curr = 1;
                currmax = nums[i];
                while(present.contains(currmax+1)){
                    curr++;
                    currmax++;
                }
                res = Math.max(res, curr);
            }
        }
        return res;
    }
}
