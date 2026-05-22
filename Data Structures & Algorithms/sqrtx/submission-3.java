class Solution {
    public int mySqrt(int x) {
        long l = 0, h = x;
        // int m = l+(h-l)/2;
        
        while(l<=h){
            long m = l+(h-l)/2;
            long sq = m*m;
            if(sq == (long)x) return (int)m;
            if(sq > (long)x) h = m-1;
            else l = m+1;
        }
        return (int)h;
    }
}