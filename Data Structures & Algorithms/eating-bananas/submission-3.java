class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        // int speed = 1;
        // while(true){
        //     long hrs = 0;
        //     for(int pile : piles){
        //         hrs += Math.ceil((double)pile/speed);
        //     }
        //     if(hrs <= h) return speed;
        //     speed++;
        // }

        int lo = 1;
        int hi = piles[0];
        for(int pile : piles){
            if(pile> hi) hi = pile;
        }
        int res = hi;

        while(lo<=hi){
            int m = lo+(hi-lo)/2;

            long time = 0;
            for(int pile:piles){
                time += Math.ceil((double) pile/m);
            }
            if(time <= h){
                res = m;
                hi = m-1;
            }
            else{
                lo = m+1;
            }
        }
        return res;
    }
}
