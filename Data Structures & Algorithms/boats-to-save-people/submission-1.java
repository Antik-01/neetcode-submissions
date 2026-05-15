class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
        int boats = 0;
        int l = 0, r = people.length-1;
        Arrays.sort(people);
        while(l<=r){
            int currLimit = limit - people[r--];
            if(people[l]<= currLimit){
                currLimit -= people[l++];
            }
            boats++;
        }
        return boats;

        // int boats = 0, currLimit = limit;
        // int totalWeight = 0;
        // for(int n : people){
        //     totalWeight += n;
        // }
        // boats = totalWeight/limit;
        // totalWeight%= limit;
        // if(totalWeight>0){
        //     boats++;
        // }
        // return boats;
    }
}